package com.vn.slide3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JSlider;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.Hashtable;

import javax.swing.JLabel;

public class JSliderDemo {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JSliderDemo window = new JSliderDemo();
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
	public JSliderDemo() {
		initialize();
	}

	JSlider slider;
	JSlider slider_1;
	JSlider slider_2;
	private JLabel lblNewLabel;
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new GridLayout(0, 1, 0, 0));
		
		Hashtable hashtable = new Hashtable();
		for (int i = 0; i < 12; i++) {
			hashtable.put(i, new JLabel(""+i));
		}
		
		slider_1 = new JSlider();
		
		frame.getContentPane().add(slider_1);
		slider_1.setLabelTable(hashtable);
		
		slider_2 = new JSlider();
		frame.getContentPane().add(slider_2);
		
		slider = new JSlider();
		frame.getContentPane().add(slider);
		
		lblNewLabel = new JLabel("Ngay thang nam...");
		frame.getContentPane().add(lblNewLabel);
	}

}
