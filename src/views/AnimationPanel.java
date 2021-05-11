package views;
/*
 * Werasiri Supachaisiriruang 5810405363
 */
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import models.AnimalComponent;

public class AnimationPanel extends JPanel  {
	private JPanel controlPanel;
	private JButton btnPlay;
	private JButton btnDecrease;
	private JButton btnIncrease;
	private JButton btnAddPeople;
	private JButton btnReverse,btnMakeSound;
	private AnimalComponent animalComp;
	
	public AnimationPanel(AnimalComponent animalComp1){
		animalComp = animalComp1;
		controlPanel  = new JPanel();
		btnPlay = new JButton("Play/Pause");
		btnIncrease = new JButton("<<");
		btnDecrease = new JButton(">>");
		btnAddPeople = new JButton("Add People");
		btnMakeSound = new JButton("Make Sound");
	}
	public void render() {
		Color purple = new Color(204,204,255);
		setPreferredSize(new Dimension(1000, 1000));
		setLayout(new BorderLayout(1, 1));
		controlPanel.add(btnAddPeople);
		controlPanel.add(btnIncrease);
		controlPanel.add(btnPlay);
		controlPanel.add(btnDecrease);
		controlPanel.add(btnMakeSound);
		controlPanel.setLayout(new FlowLayout()); 
		controlPanel.setBackground(purple);
		add(animalComp);
		add(controlPanel,BorderLayout.SOUTH);
	}
	public JButton getBtnPlay() {
		return btnPlay;
	}


	public JButton getBtnDecrease() {
		return btnDecrease;
	}

	public JButton getBtnAddPeople() {
		return btnAddPeople;
	}

	public JButton getBtnIncrease() {
		return btnIncrease;
	}
	public JButton getBtnReverse() {
		return btnReverse;
	}
	public JButton getBtnMakeSound() {
		return btnMakeSound;
	}


}
