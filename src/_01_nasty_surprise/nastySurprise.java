package _01_nasty_surprise;

import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class nastySurprise {
public static void main(String[] args) {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton();
	JButton button2 = new JButton();
	frame.setVisible(true);
	frame.setPreferredSize(new Dimension(550, 500));
	button.setText("Trick");
	button2.setText("Treat");
	button.setSize(50, 50);
	button2.setSize(50, 50);
	button.addActionListener(null);
	button2.addActionListener(null);
	panel.add(button2);
	panel.add(button);
	frame.pack();
    
}
}
