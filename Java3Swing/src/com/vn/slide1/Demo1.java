package com.vn.slide1;

import java.awt.Rectangle;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Demo1 extends JFrame {
	
	
	public static void main(String[] args) {
		Demo1 demo1 = new Demo1();
		JPanel jPanel = new JPanel();
		
		for (int i = 0; i < 10; i++) {
			jPanel.add(new JButton(""+i));
		}
		demo1.getContentPane().add(jPanel);
		demo1.setBounds(new Rectangle(100, 100, 450, 300));
		demo1.setDefaultCloseOperation(EXIT_ON_CLOSE);
		demo1.setVisible(true);
	}
}
