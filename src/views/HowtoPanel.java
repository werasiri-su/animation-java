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

public class HowtoPanel extends JPanel {
	private ImageIcon image;
	private JPanel controlPanel;
	private JButton btnStart,btnDeveloper;
	
	public HowtoPanel(){
		java.net.URL url = StartPanel.class.getResource("/sources/howto.jpg");
		image = new ImageIcon(url);
		controlPanel  = new JPanel();
		btnStart = new JButton("Start");
		btnDeveloper = new  JButton("Developer");

	}
	public void render() {
		
		setPreferredSize(new Dimension(1000, 1000));
		 setLayout(new BorderLayout(1, 1));
		JLabel label = new JLabel("", image, JLabel.CENTER);
		JPanel panel = new JPanel(new BorderLayout());
		panel.add( label, BorderLayout.NORTH);
		controlPanel.add(btnStart);
		controlPanel.add(btnDeveloper);
		controlPanel.setLayout(new FlowLayout()); 
		controlPanel.setBackground(Color.yellow);
		add(panel);
		add(controlPanel,BorderLayout.SOUTH);
	}
	public JButton getBtnStart() {
		return btnStart;
	}
	public JButton getBtnDeveloper() {
		return btnDeveloper;
	}

}
