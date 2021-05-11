package controllers;

/*
 * Werasiri Supachaisiriruang 5810405363
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JFrame;
import javax.swing.Timer;

import models.AnimalComponent;
import views.DeveloperPanel;
import views.DrawingView;
import views.StartPanel;

public class DrawingController {
	private String status = "play";
	private AnimalComponent animalComp;
	private DrawingView view;
	private Thread lionSound, tigerSound, elephantSound;
	private ArrayList<Thread> threads;
	private TimerListener timerListener;

	public DrawingController() {
		animalComp = new AnimalComponent();
		view = new DrawingView(animalComp);
		timerListener = new TimerListener(animalComp);
		threads = new ArrayList<Thread>();

		lionSound = makeSound("lion_roar.wav");
		tigerSound = makeSound("tiger_growl.wav");
		elephantSound = makeSound("elephant.wav");
		threads.add(tigerSound);
		threads.add(lionSound);
		threads.add(elephantSound);

	}

	public void startApplication() {
		view.initFrame();
		view.getAnimationPanel().getBtnPlay().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				switch (status) {
				case "play":
					status = "pause";
					timerListener.setStatus("pause");
					break;
				case "pause":
					timerListener.setSpeed(-10);
					status = "play";
					timerListener.setStatus("play");
					break;
				}
			}
		});
		view.getAnimationPanel().getBtnDecrease().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (timerListener.getSpeed() >= -10) {
					timerListener.setSpeed(-20);
				} else if (timerListener.getSpeed() > -120) {
					timerListener.setSpeed(timerListener.getSpeed() - 10);

				}
				timerListener.setStatus("play");
			}
		});
		view.getAnimationPanel().getBtnIncrease().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (timerListener.getSpeed() <= -10) {
					timerListener.setSpeed(20);
				} else if (timerListener.getSpeed() < 120) {
					timerListener.setSpeed(timerListener.getSpeed() + 10);
				}
				timerListener.setStatus("play");
			}
		});
		view.getAnimationPanel().getBtnAddPeople().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				animalComp.getPeople().addPeople();
				;
			}
		});
		view.getHowtoPanel().getBtnDeveloper().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				DeveloperPanel developer = new DeveloperPanel();
				developer.initPanel();

			}
		});
		view.getStartPanel().getBtnStart().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				view.getFrame().remove(view.getStartPanel());
				view.getFrame().add(view.getAnimationPanel());
				view.getFrame().pack();

			}
		});
		view.getHowtoPanel().getBtnStart().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				view.getFrame().remove(view.getHowtoPanel());
				view.getFrame().add(view.getAnimationPanel());
				view.getFrame().pack();

			}
		});

		view.getStartPanel().getBtnHowto().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				view.getFrame().remove(view.getStartPanel());
				view.getFrame().add(view.getHowtoPanel());
				view.getFrame().pack();
			}
		});
		view.getAnimationPanel().getBtnMakeSound().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				threads = new ArrayList<Thread>();
				lionSound = makeSound("lion_roar.wav");
				tigerSound = makeSound("tiger_growl.wav");
				elephantSound = makeSound("elephant.wav");
				threads.add(tigerSound);
				threads.add(lionSound);
				threads.add(elephantSound);
				if (timerListener.getStatus().equals("play")) {
					for (Thread thread : threads) {
						thread.start();
					}
				}

			}
		});
		final int DURATION = 200;
		Timer t = new Timer(DURATION, timerListener);
		t.start();

	}

	public synchronized Thread makeSound(String url) {
		return new Thread(new Runnable() {
			public void run() {
				try {
					Clip clip = AudioSystem.getClip();
					AudioInputStream inputStream = AudioSystem
							.getAudioInputStream(getClass().getResource("/sources/" + url));
					clip.open(inputStream);
					clip.start();

				} catch (Exception e) {
					System.err.println(e.getMessage());
				}

			}
		});

	}
}
