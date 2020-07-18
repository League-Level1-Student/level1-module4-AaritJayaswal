package _08_calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements Runnable, ActionListener{

	public void	run(){
			
			JFrame frame = new JFrame();
			frame.setTitle("Calculator");
			frame.setVisible(true);
			
			JPanel panel = new JPanel();
					
		JTextField number1 = new JTextField(5);
		JTextField number2 = new JTextField(5);
		
		JButton add = new JButton();
		add.setText("add");
		JButton subtract = new JButton();
		subtract.setText("subtract");
		JButton multiply = new JButton();
		multiply.setText("multiply");
		JButton divide = new JButton();
		divide.setText("divide");
		
		panel.add(number1);
		panel.add(number2);
		panel.add(add);
		panel.add(subtract);
		panel.add(multiply);
		panel.add(divide);
	
	frame.add(panel);
	frame.pack();
	
	String one = number1.getText();
	int o = Integer.parseInt(one);
	
	String two = number2.getText();
	int t = Integer.parseInt(two);	
	
	
	
	add.addActionListener(this);
	subtract.addActionListener(this);
	multiply.addActionListener(this);
	divide.addActionListener(this);
}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
