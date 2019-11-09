package _05_typing_tutor;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class typingTutor implements KeyListener {
JFrame frame = new JFrame();
JLabel label = new JLabel();
JPanel panel = new JPanel();
char currentLetter;
void makeButtons() {
	frame.add(panel);
	frame.setVisible(true);
	frame.setSize(1000, 500);
	frame.setTitle("Type or Die!");
	currentLetter = generateRandomLetter();
	panel.add(label);
	label.setText(Character.toString(currentLetter));
	label.setFont(label.getFont().deriveFont(100.0f));
	label.setHorizontalAlignment(JLabel.CENTER);
	frame.add(label);
	frame.addKeyListener(this);
	
}


char generateRandomLetter() {
    Random r = new Random();
    return (char) (r.nextInt(26) + 'a');
}


@Override
public void keyTyped(KeyEvent e) {
	// TODO Auto-generated method stub
	
}


@Override
public void keyPressed(KeyEvent e) {
	// TODO Auto-generated method stub
	
	System.out.println(e.getSource());
	if(e.getKeyChar() == currentLetter) {
		System.out.println("Correct!");
		panel.setBackground(Color.green);
	}
	else
	{panel.setBackground(Color.RED);}
}


@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
	currentLetter = generateRandomLetter();
	label.setText(Character.toString(currentLetter));
}

}