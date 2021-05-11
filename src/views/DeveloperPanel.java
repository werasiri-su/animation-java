package views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class DeveloperPanel {
	private JFrame frame;
	private JTextArea textTitle,textDetail;;
	private final int FRAME_WIDTH = 500;
	private final int FRAME_HEIGHT = 200;
	public DeveloperPanel() {
		frame = new JFrame("Developer");
	}

	public void initPanel() {
		Color green = new Color(204,255,204);
		Dimension d = new Dimension(FRAME_WIDTH, FRAME_HEIGHT);
		frame.setSize(d);
		frame.setPreferredSize(d);
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		
		frame.setVisible(true);
		
		Font font = new Font("Verdana", 1, 20);
		textTitle = new JTextArea();
		textTitle.setFont(font);
		textTitle.setText("Name : Werasiri Supachaisiriruang\n Student id : 5810405363");
		textTitle.setEditable(false);
		JPanel textPanel = new  JPanel();
		textPanel.setBackground(green);
		textPanel.add(textTitle);
		frame.add(textPanel);
		frame.pack();
	}

}

