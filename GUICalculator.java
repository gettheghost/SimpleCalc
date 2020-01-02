import java.awt.Color;

import javax.swing.*;

public class GUICalculator extends JFrame {
	public static void main(String[] args) {
		
		GUICalculator cal  = new GUICalculator();
		
		cal.setTitle("GUI Calculator");
		
		cal.setSize(600,600);
		
		cal.setVisible(true);
		
		cal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

	public GUICalculator () {
		JPanel panel1 = new JPanel();
		JLabel label1 = new JLabel("Welcome");
		
		panel1.add(label1);
		panel1.setBackground(Color.gray);
		this.add(panel1);
		
		JButton button1 = new JButton("button1");
		JTextField textField1 = new JTextField(20);
		JTextArea textArea1 = new JTextArea(20,20);
		
		panel1.add(button1);
		panel1.add(textField1);
		panel1.add(textArea1);
	}
}
