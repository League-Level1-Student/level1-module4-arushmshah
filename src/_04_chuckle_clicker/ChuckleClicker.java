package _04_chuckle_clicker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton joke = new JButton();
	JButton punchline = new JButton();
void makeButtons(){
	
	frame.show();
	frame.setSize(400, 100);
	panel.show();
	joke.show();
	joke.setText("JOKE");
	joke.addActionListener(this);
	punchline.show();
	punchline.setText("PUNCHLINE");
	punchline.addActionListener(this);
	frame.add(panel);
	panel.add(joke);
	panel.add(punchline);
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource() == joke) {
		JOptionPane.showConfirmDialog(null, "Why did Peter Pan fail as a stand-up comedian");
	}
		else if(e.getSource() == punchline) {
			JOptionPane.showConfirmDialog(null, "Because his jokes Neverland!");
		}
	
}
}
