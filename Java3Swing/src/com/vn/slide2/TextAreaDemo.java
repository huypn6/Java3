package com.vn.slide2;

import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JTextArea;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.ScrollPaneLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class TextAreaDemo {

	private JFrame frame;
	private JTextField textField;
	private final JButton btnNewButton = new JButton("New button");
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TextAreaDemo window = new TextAreaDemo();
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
	public TextAreaDemo() {
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
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 1.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 1.0, 0.0, 1.0, Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);
		
		JLabel lblInputFile = new JLabel("Input file");
		GridBagConstraints gbc_lblInputFile = new GridBagConstraints();
		gbc_lblInputFile.insets = new Insets(0, 0, 5, 5);
		gbc_lblInputFile.gridx = 1;
		gbc_lblInputFile.gridy = 1;
		frame.getContentPane().add(lblInputFile, gbc_lblInputFile);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 0);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 3;
		gbc_textField.gridy = 1;
		frame.getContentPane().add(textField, gbc_textField);
		textField.setColumns(10);
		
		JScrollPane scrollBar=new JScrollPane(textArea,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.gridheight = 2;
		gbc_panel.insets = new Insets(0, 0, 5, 5);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 2;
		gbc_panel.gridy = 2;
		
		scrollBar.setMinimumSize(new Dimension(300, 200));
		frame.getContentPane().add(scrollBar, gbc_panel);
//		ScrollPaneLayout gbl_panel = new ScrollPaneLayout();
//		gbl_panel.columnWidths = new int[]{0, 0};
//		gbl_panel.rowHeights = new int[]{0, 0};
//		gbl_panel.columnWeights = new double[]{1.0, Double.MIN_VALUE};
//		gbl_panel.rowWeights = new double[]{1.0, Double.MIN_VALUE};
//		panel.setLayout(gbl_panel);
		
		textArea = new JTextArea();
		GridBagConstraints gbc_textArea = new GridBagConstraints();
		gbc_textArea.fill = GridBagConstraints.BOTH;
		gbc_textArea.gridx = 0;
		gbc_textArea.gridy = 0;
//		scrollBar.add(textArea, gbc_textArea);
		scrollBar.setViewportView(textArea);
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.gridx = 3;
		gbc_btnNewButton.gridy = 4;
		frame.getContentPane().add(btnNewButton, gbc_btnNewButton);
	}

}
