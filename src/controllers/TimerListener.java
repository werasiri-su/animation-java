package controllers;

/*
 * Werasiri Supachaisiriruang 5810405363
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;

import models.AnimalComponent;

public class TimerListener implements ActionListener {
	AnimalComponent animalComp;
	private int speed = -10;
	private String status = "play";

	public void setStatus(String newStatus) {
		status = newStatus;
	}
	public String getStatus() {
		return status;
	}

	public void setSpeed(int newSpeed) {
		speed = newSpeed;
	}

	public int getSpeed() {
		return speed;
	}

	public TimerListener(AnimalComponent component) {
		animalComp = component;

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch (status) {
		case "play":
			animalComp.changeLocation(speed);
			animalComp.repaint();
			break;
		case "pause":
			animalComp.changeLocation(0);
			break;
		}


	}

}
