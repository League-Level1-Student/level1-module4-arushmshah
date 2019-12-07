package _10_pig_latin;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PIG_LATIN implements ActionListener {
JFrame frame = new JFrame();
JPanel panel = new JPanel();
JButton button = new JButton();
JTextField tf = new JTextField();
JTextField tf2 = new JTextField();

void UserInterface() {
	frame.setVisible(true);
	frame.add(panel);
	panel.add(button);
	panel.add(tf);
	panel.add(tf2);
	frame.setTitle("Arush's Pig Latin Translator");
	button.setText("Translate");
	button.addActionListener(this);
	frame.pack();
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
}













}
