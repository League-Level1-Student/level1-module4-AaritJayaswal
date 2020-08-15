package _11_whack_a_mole;

import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class WhackAMole {

	JFrame frame = new JFrame();
			
	JPanel panel = new JPanel();
	
	
	
	public void run() {
		
		for(int i = 0 ; i<100; i++) {
		
		drawButtons();
		}
		
	}
	
	
	public void drawButtons() {
		Random ran = new Random();
			int r =	ran.nextInt(18 - 5);
	
		System.out.println(r);
		
	}
	
	
}
