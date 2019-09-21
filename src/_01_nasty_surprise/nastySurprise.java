package _01_nasty_surprise;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class nastySurprise implements ActionListener {
	static JFrame frame = new JFrame();
	static JPanel panel = new JPanel();
	static JButton button = new JButton();
	static JButton button2 = new JButton();

	public static void main(String[] args) {
		nastySurprise u = new nastySurprise();
		frame.setVisible(true);
		frame.setPreferredSize(new Dimension(550, 500));
		button.setText("Trick");
		button2.setText("Treat");
		button.setSize(50, 50);
		button2.setSize(50, 50);
		u.a();
		panel.add(button2);
		panel.add(button);
		frame.add(panel);
		frame.pack();

	}

	void a() {
		button.addActionListener(this);
		button2.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stubpup
		if (button == e.getSource()) {
			showPictureFromTheInternet("https://www.thelabradorsite.com/wp-content/uploads/2019/03/Cute-puppy-Names-Over-200-Adorable-Ideas-LS-long.jpg");

		}
		if (button2 == e.getSource()) {
			showPictureFromTheInternet("https://www.nydailynews.com/resizer/EY_4Q20DxKXuaA2yXMNW52hmkN4=/800x542/top/arc-anglerfish-arc2-prod-tronc.s3.amazonaws.com/public/ABRM7TW6WJALDEB6ZARYTSCOF4.jpg");
		}
	}

	private void showPictureFromTheInternet(String imageUrl) {
		try {
			URL url = new URL(imageUrl);
			Icon icon = new ImageIcon(url);
			JLabel imageLabel = new JLabel(icon);
			JFrame frame = new JFrame();
			frame.add(imageLabel);
			frame.setVisible(true);
			frame.pack();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

}
