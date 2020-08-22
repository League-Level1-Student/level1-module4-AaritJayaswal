package _11_whack_a_mole;

import java.awt.Dimension;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class WhackAMole {

	JFrame frame = new JFrame();
			
	JPanel panel = new JPanel();
	
	
	public void run() {
		Random ran = new Random();
		int r = ran.nextInt(24);
		
		drawButtons(r);
		frame.add(panel);
		frame.setSize(500,500);
		frame.setVisible(true);
		
	}
	
	
	public void drawButtons(int randomnumber) {
for(int i = 0; i<24; i++) {
	
			JButton button = new JButton();
			
			button.setPreferredSize(new Dimension(50,20));
			if(i == randomnumber) {
				
			button.setText("Mole!");
			
			}
			panel.add(button);
		
		}
		
	}

	
}
