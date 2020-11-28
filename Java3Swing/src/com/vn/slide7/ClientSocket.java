package com.vn.slide7;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ClientSocket {

	Socket socket;
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClientSocket window = new ClientSocket();
					window.frame.setTitle("Client");
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
	public ClientSocket() {
		initialize();

		
		try {
			socket = new Socket("localhost", 10);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

	/**
	 * Initialize the contents of the frame.
	 */
	TextArea history;
	private TextField txtChat;

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JButton btnSend = new JButton("Send");
		btnSend.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		frame.getContentPane().add(btnSend, BorderLayout.SOUTH);

		history = new TextArea();
		frame.getContentPane().add(history, BorderLayout.CENTER);

		txtChat = new TextField();
		frame.getContentPane().add(txtChat, BorderLayout.EAST);
		btnSend.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
					dataOutputStream.write(txtChat.getText().getBytes());
					dataOutputStream.flush();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}

}
