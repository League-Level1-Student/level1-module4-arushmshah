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

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	String v1 = tf.getText();
	if(e.getSource()==add) {
		int vone = Integer.parseInt(v1);
}


}
}


