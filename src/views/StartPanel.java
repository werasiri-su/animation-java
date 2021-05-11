package views;
/*
 * Werasiri Supachaisiriruang 5810405363
 */
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.print.DocFlavor.URL;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class StartPanel extends JPanel {
	private JPanel controlPanel;
	private JButton btnStart;
	private JButton btnHowto;
	private ImageIcon image;
	public StartPanel(){
		java.net.URL url = StartPanel.class.getResource("/sources/picStart.jpg");
		image = new ImageIcon(url);
		controlPanel  = new JPanel();
		btnStart = new JButton("Start");
		btnHowto = new JButton("How to use");

	}
	public void render() {
		setPreferredSize(new Dimension(1000, 1000));
		 setLayout(new BorderLayout(1, 1));
		JLabel label = new JLabel("", image, JLabel.CENTER);
		JPanel panel = new JPanel(new BorderLayout());
		panel.add( label, BorderLayout.NORTH);
		controlPanel.add(btnStart);
		controlPanel.add(btnHowto);
		controlPanel.setLayout(new FlowLayout()); 
		controlPanel.setBackground(Color.yellow);
		add(panel);
		add(controlPanel,BorderLayout.SOUTH);
	}


	public JButton getBtnStart() {
		return btnStart;
	}

	public JButton getBtnHowto() {
		return btnHowto;
	}
}
