package _08_calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class calculator implements ActionListener {
int one;
int two;
JFrame frame = new JFrame();
JPanel panel = new JPanel();
JButton add = new JButton();
JButton sub = new JButton();
JButton mult = new JButton();
JButton div = new JButton();
JTextField tf = new JTextField();
JLabel label = new JLabel();
void userinterthingy() {
	frame.setVisible(true);
	frame.add(panel);
	panel.add(add);
	panel.add(sub);
	panel.add(mult);
	panel.add(div);
	panel.add(tf);
	panel.add(label);
	add.addActionListener(this);	
	sub.addActionListener(this);
	mult.addActionListener(this);
	div.addActionListener(this);
	
	
	
	
	
	
	
	
	
	
	
	
}
void add() {
	one + two;
}
void subtract() {
	one - two
}

void multiply() {
	one * two
}
void divide() {
	one/two
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
}


}
