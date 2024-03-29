package br.com.cod3r.composite.swing;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.*;

public class Client {
	public static void main(String[] args) {
		JLabel title = new JLabel("Title");
		JLabel label = new JLabel("Label #1");
		JButton button = new JButton("Button #1");

		JPanel panel = new JPanel(new FlowLayout());
		panel.add(label);
		panel.add(button);
		
		JFrame frame = new JFrame();
		frame.setLayout(new BorderLayout());
		
		frame.add(title, BorderLayout.NORTH);
		frame.add(panel, BorderLayout.CENTER);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400,200);
		frame.setVisible(true);
	}
}
