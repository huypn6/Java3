package com.vn.slide2;

import javax.swing.JFrame;

import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DemoComponent extends JFrame {
	private JTextField txtUsername;
	private JPasswordField txtPassword;
	
	public static void main(String[] args) {
		DemoComponent demoComponent =  new DemoComponent();
		demoComponent.setSize(450,300);
		demoComponent.setVisible(true);
	}
	
	public DemoComponent() {
		getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblUserName = new JLabel("<html><span style ='color:blue'>User name</span></html>");
		getContentPane().add(lblUserName);
		
		txtUsername = new JTextField();
		getContentPane().add(txtUsername);
		txtUsername.setColumns(10);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				submitLogin();
			}
		});
		
		JLabel lblPassword = new JLabel("<html><span style ='color:blue'>Password</span></html>");
		getContentPane().add(lblPassword);
		
		txtPassword = new JPasswordField();
		txtPassword.setEchoChar('*');
		txtPassword.setColumns(10);
		getContentPane().add(txtPassword);
		getContentPane().add(btnSubmit);
	}
	protected void submitLogin() {
		//1. get input from jtextfield
		validateInput(txtUsername);
		validateInput(txtPassword);
	}
	
	private void validateInput(JTextField txtField) {
		String str = txtField.getText();
		boolean isBlank = str == null || "".equals(str);
		if(isBlank) {
			//2.2 incorrect, requestFocus(), setBackground()
			txtField.setBackground(Color.red);
			txtField.requestFocus();
		} else {
			//2.1 correct
			System.out.println("ok");
		}
	}

}
