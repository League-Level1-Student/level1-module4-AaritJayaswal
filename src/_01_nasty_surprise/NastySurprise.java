package _01_nasty_surprise;

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

public class NastySurprise implements Runnable, ActionListener {

	public static void main(String[]args) {
		
		
		
	new NastySurprise().start();
		
		
	}
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton one = new JButton();
	JButton two = new JButton();
public void start() {
	
	
frame.add(panel);
	
	frame.pack();
	
	frame.setVisible(true);
	
	panel.add(one);

	one.addActionListener(this);
	
	one.setText("Treat");
	
	panel.add(two);
	
	two.addActionListener(this);
	
	two.setText("Trick");
	
	frame.add(panel);
	
	frame.pack();
	
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




@Override
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
	if (arg0.getSource() ==two) {
		
		showPictureFromTheInternet("https://media.npr.org/assets/img/2016/10/14/gettyimages-590648955_wide-9434ebe4d129c52f37d9655c31cfe59c5f6c9ba5-s800-c85.jpg");
		
	}
	
	if (arg0.getSource()==one) {
		
		showPictureFromTheInternet("https://media.npr.org/assets/img/2016/10/14/gettyimages-590648955_wide-9434ebe4d129c52f37d9655c31cfe59c5f6c9ba5-s800-c85.jpg");
		
	}
	
}




@Override
public void run() {
	// TODO Auto-generated method stub
	
}
}