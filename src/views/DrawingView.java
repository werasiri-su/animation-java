package views;
/*
 * Werasiri Supachaisiriruang 5810405363
 */
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import models.AnimalComponent;

public class DrawingView extends JFrame {
	private JFrame animationFrame;
	private final int FRAME_WIDTH = 1000;
	private final int FRAME_HEIGHT = 1025;
	private StartPanel panel1;
	private AnimationPanel panel2;
	private HowtoPanel panel3;
	private JButton btnPlay;
	private JButton btnDecrease;
	private JButton btnIncrease;
	private JButton btnAddPeople;
	private JButton btnHowto;
	private JButton btnStart,btnNew;
	private AnimalComponent animalComp;

	public DrawingView(AnimalComponent animalComp2) {
		animationFrame = new JFrame();
		Color colorBg = new Color(254,217,106);
		setBackground(colorBg);
		panel2 = new AnimationPanel(animalComp2);
		panel1 = new StartPanel();
		panel1.render();
		panel1.setVisible(true);
		panel2.render();
		panel2.setVisible(true);
		panel3 = new HowtoPanel();
		panel3.render();
		panel3.setVisible(true);
		

	}

	public void initFrame() {
		Dimension d = new Dimension(FRAME_WIDTH, FRAME_HEIGHT);
		animationFrame.setSize(d);
		animationFrame.setPreferredSize(d);
		animationFrame.setLayout(new BorderLayout()); 
		animationFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		animationFrame.add(panel1);
		animationFrame.setTitle("ZooZaaa");
		animationFrame.pack();
		animationFrame.setVisible(true);
		

	}
	public StartPanel getStartPanel() {
		return panel1;
	}


	public AnimationPanel getAnimationPanel() {
		return panel2;
	}
	public HowtoPanel getHowtoPanel() {
		return panel3;
	}
	public JFrame getFrame(){
		return animationFrame;
	}




}
