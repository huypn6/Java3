package com.vn.slide2;

import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JRadioButton;

public class RadioButtonDemo {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RadioButtonDemo window = new RadioButtonDemo();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public RadioButtonDemo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new GridLayout(4,1));
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Th\u00EDch");
		frame.getContentPane().add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("B\u00ECnh th\u01B0\u1EDDng");
		frame.getContentPane().add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("Kh\u00F4ng th\u00EDch l\u1EAFm");
		frame.getContentPane().add(rdbtnNewRadioButton_3);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Gh\u00E9t");
		frame.getContentPane().add(rdbtnNewRadioButton);
		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(rdbtnNewRadioButton_1);
		buttonGroup.add(rdbtnNewRadioButton_2);
		buttonGroup.add(rdbtnNewRadioButton_3);
		buttonGroup.add(rdbtnNewRadioButton);
	}

}
