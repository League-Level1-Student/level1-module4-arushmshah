package _99_extra;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PracticeTest1Question12 implements ActionListener {
JFrame frame = new JFrame();
JPanel panel = new JPanel();
JLabel label = new JLabel();
JButton button1 = new JButton();
JButton button2 = new JButton();
JTextField tf = new JTextField();
void userinterface() {
	frame.setVisible(true);
	frame.add(panel);
	panel.add(label);
	panel.add(button1);
	panel.add(button2);
	panel.add(tf);
	label.setText("The more you take, the more you leave behind. What am I?");
	button1.setText("Hint");
	button2.setText("Submit");
	button1.addActionListener(this);
	button2.addActionListener(this);
	
	
	frame.pack();
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource()==button1) {
		JOptionPane.showConfirmDialog(null, "The answer is a word with the name of a body part in it");
	}
}
}
