package _11_whack_a_mole;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class WhackAMole implements ActionListener {

	JFrame frame = new JFrame();
			
	JPanel panel = new JPanel();
	
	int whackCount;
	
	Random ran = new Random();
	int r = ran.nextInt(24);
	
	public void run() {
		
		drawButtons(r);
		frame.add(panel);
		frame.setSize(500,500);
		frame.setVisible(true);
		
	}
	
	
	public void drawButtons(int randomnumber) {
for(int i = 0; i<24; i++) {
	
			 JButton button = new JButton();
			
			button.addActionListener(this);
			
			button.setPreferredSize(new Dimension(100,50));
			if(i == randomnumber) {
				
			button.setText("Mole!");
			
			
			}
			panel.add(button);
		
		}
		
	}


	@Override
	public void actionPerformed(ActionEvent arg0) {
		JButton button = (JButton) arg0.getSource();
		
		if (button.getText().equals("Mole!")) {
			
			whackCount++;
			
			
			frame.dispose();
			
			drawButtons(r);
		}
		
		else {
			
			speak("Miss");
		}
		
	}

	
	
	
	static void speak(String words) {
        if( System.getProperty( "os.name" ).contains( "Windows" ) ) {
            String cmd = "PowerShell -Command \"Add-Type -AssemblyName System.Speech; (New-Object System.Speech.Synthesis.SpeechSynthesizer).Speak('"
                    + words + "');\"";
            try {
                Runtime.getRuntime().exec( cmd ).waitFor();
            } catch( Exception e ) {
                e.printStackTrace();
            }
        } else {
            try {
                Runtime.getRuntime().exec( "say " + words ).waitFor();
            } catch( Exception e ) {
                e.printStackTrace();
            }
        }
    }

	
	
	private void endGame(Date timeAtStart, int molesWhacked) { 
	    Date timeAtEnd = new Date();
	    JOptionPane.showMessageDialog(null, "Your whack rate is "
	            + ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked)
	                  + " moles per second.");
	}
	
}
