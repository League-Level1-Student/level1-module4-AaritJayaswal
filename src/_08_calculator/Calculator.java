package _08_calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements Runnable, ActionListener{

	JButton add = new JButton();
	JButton subtract = new JButton();
	JButton multiply = new JButton();
	JButton divide = new JButton();
	
	JTextField number1 = new JTextField(5);
	JTextField number2 = new JTextField(5);
	
	JLabel label = new JLabel();
	
	Double a;
	

	
	
	
	public void	run(){
			
			JFrame frame = new JFrame();
			frame.setTitle("Calculator");
			frame.setVisible(true);
			
			JPanel panel = new JPanel();
					
		
		
		
		add.setText("add");
		
		subtract.setText("subtract");
		
		multiply.setText("multiply");
		
		divide.setText("divide");
		
		panel.add(number1);
		panel.add(number2);
		panel.add(add);
		panel.add(subtract);
		panel.add(multiply);
		panel.add(divide);
	
		panel.add(label);
		
	frame.add(panel);
	frame.pack();
	
	
	
	
	
	add.addActionListener(this);
	subtract.addActionListener(this);
	multiply.addActionListener(this);
	divide.addActionListener(this);
}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if(arg0.getSource()==add){
			
			String one = number1.getText();
			Double o = Double.parseDouble(one);
			
			String two = number2.getText();
			Double t = Double.parseDouble(two);	
			
			a = o+t;
			
			 String answer = String.valueOf(a);
				
				
			 label.setText(answer);
			
		}
		
		else if(arg0.getSource()==subtract) {
			
			String one = number1.getText();
			Double o = Double.parseDouble(one);
			
			String two = number2.getText();
			Double t = Double.parseDouble(two);	
			
			a = o-t;
			
			 String answer = String.valueOf(a);
			 label.setText(answer);
			
			
			
		}
		
		else if(arg0.getSource()==multiply) {
		
			String one = number1.getText();
			Double o = Double.parseDouble(one);
			
			String two = number2.getText();
			Double t = Double.parseDouble(two);	
			
			a = o*t;
			
			 String answer = String.valueOf(a);
				
			 label.setText(answer);	
		
			
		}
		
		else {
		
			
			
			String one = number1.getText();
			Double o = Double.parseDouble(one);
			
			String two = number2.getText();
			Double t = Double.parseDouble(two);	
			
			a = o/t;
			
			 String answer = String.valueOf(a);
				
				label.setText(answer);
			
			
	}
}
}
