package com.vn.slide2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import java.awt.Insets;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FileChooseDemo {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FileChooseDemo window = new FileChooseDemo();
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
	public FileChooseDemo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);
		
		JLabel lblFile = new JLabel("File");
		GridBagConstraints gbc_lblFile = new GridBagConstraints();
		gbc_lblFile.insets = new Insets(0, 0, 0, 5);
		gbc_lblFile.gridx = 3;
		gbc_lblFile.gridy = 1;
		frame.getContentPane().add(lblFile, gbc_lblFile);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.gridwidth = 6;
		gbc_textField.insets = new Insets(0, 0, 0, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 5;
		gbc_textField.gridy = 1;
		frame.getContentPane().add(textField, gbc_textField);
		textField.setColumns(10);
		
		JButton btnChoooseFile = new JButton("Chooose File");
		btnChoooseFile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				chooseFile();
			}
		});
		GridBagConstraints gbc_btnChoooseFile = new GridBagConstraints();
		gbc_btnChoooseFile.gridx = 12;
		gbc_btnChoooseFile.gridy = 1;
		frame.getContentPane().add(btnChoooseFile, gbc_btnChoooseFile);
	}

	protected void chooseFile() {
		JFileChooser chooser = new JFileChooser();
		chooser.setVisible(true);
		chooser.showOpenDialog(frame);
	}

}
