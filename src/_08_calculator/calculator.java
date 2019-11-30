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
JButton add = new JButton("Add");
JButton sub = new JButton("Subtract");
JButton mult = new JButton("Multiply");
JButton div = new JButton("Divide");
JTextField tf = new JTextField(5);
JTextField tf2 = new JTextField(5);
JLabel label = new JLabel();
void userinterthingy() {
	frame.setVisible(true);
	frame.add(panel);
	panel.add(add);
	panel.add(sub);
	panel.add(mult);
	panel.add(div);
	panel.add(tf);
	panel.add(tf2);
	panel.add(label);
	add.addActionListener(this);	
	sub.addActionListener(this);
	mult.addActionListener(this);
	div.addActionListener(this);
	frame.pack();                                                                           
}
double a;
String v1;
double vone;
String v2;
int vtwo;

void addition() {
	a = vone + vtwo ;
	System.out.println(a);
	
}
void subtraction() {
	a = vone - vtwo ;
	System.out.println(a);
}
void multiplacation() {
	a = vone * vtwo ;
	System.out.println(a);
}
void division() {
	a = vone/vtwo ;
	System.out.println(a);
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	 v1 = tf.getText();
	 vone = Double.parseDouble(v1);
	 v2 = tf2.getText();
	 vtwo = (int) Double.parseDouble(v2);
	
	if(e.getSource()==add) {
		addition();
	}
	
	if(e.getSource()==sub) {
		subtraction();
	}
	
	if(e.getSource()==mult) {
		multiplacation();
	}
	
	if(e.getSource()==div) {
		division();
	}
	label.setText(String.valueOf(a));
	frame.pack();
}
}