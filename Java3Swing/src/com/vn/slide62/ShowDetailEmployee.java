package com.vn.slide62;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ShowDetailEmployee {

	JFrame frame;
	private JTextField txtUname;
	private JTextField txtUpass;
	private JTextField txtDescription;
	private JTextField txtAge;

	/**
	 * Create the application.
	 */
	public ShowDetailEmployee(Employee employee) {
		initialize();
		showDetailEmployee(employee);
		
	}

	private void showDetailEmployee(Employee employee) {
		txtUname.setText(employee.getTxtUname());
		txtUpass.setText(employee.getTxtUpass());
		txtDescription.setText(employee.getTxtDescription());
		txtAge.setText(employee.getTxtAge() + "");
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);
		
		JLabel lblNewLabel = new JLabel("Username");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 1;
		frame.getContentPane().add(lblNewLabel, gbc_lblNewLabel);
		
		txtUname = new JTextField();
		GridBagConstraints gbc_txtUname = new GridBagConstraints();
		gbc_txtUname.insets = new Insets(0, 0, 5, 0);
		gbc_txtUname.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtUname.gridx = 2;
		gbc_txtUname.gridy = 1;
		frame.getContentPane().add(txtUname, gbc_txtUname);
		txtUname.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 1;
		gbc_lblNewLabel_1.gridy = 3;
		frame.getContentPane().add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		txtUpass = new JTextField();
		GridBagConstraints gbc_txtUpass = new GridBagConstraints();
		gbc_txtUpass.insets = new Insets(0, 0, 5, 0);
		gbc_txtUpass.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtUpass.gridx = 2;
		gbc_txtUpass.gridy = 3;
		frame.getContentPane().add(txtUpass, gbc_txtUpass);
		txtUpass.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Description");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 1;
		gbc_lblNewLabel_2.gridy = 5;
		frame.getContentPane().add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		txtDescription = new JTextField();
		GridBagConstraints gbc_txtDescription = new GridBagConstraints();
		gbc_txtDescription.insets = new Insets(0, 0, 5, 0);
		gbc_txtDescription.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtDescription.gridx = 2;
		gbc_txtDescription.gridy = 5;
		frame.getContentPane().add(txtDescription, gbc_txtDescription);
		txtDescription.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Age");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel_3.gridx = 1;
		gbc_lblNewLabel_3.gridy = 7;
		frame.getContentPane().add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		txtAge = new JTextField();
		GridBagConstraints gbc_txtAge = new GridBagConstraints();
		gbc_txtAge.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtAge.gridx = 2;
		gbc_txtAge.gridy = 7;
		frame.getContentPane().add(txtAge, gbc_txtAge);
		txtAge.setColumns(10);
	}

}
