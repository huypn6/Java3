package com.vn.slide7;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ServerDemoSocket {

	int portServer = 10;
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ServerDemoSocket window = new ServerDemoSocket();
					window.frame.setTitle("Server");
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
	public ServerDemoSocket() {
		initialize();
		try {
			ServerSocket serverSocket = new ServerSocket(portServer);
			Runnable runnable = new Runnable() {
				@Override
				public void run() {
					while (true) {
						try {
							Socket socketClient = serverSocket.accept();
							DataInputStream dataInputStream  = new DataInputStream(socketClient.getInputStream());
							int dataItem = dataInputStream.read();
							while(dataItem != -1) {
								history.append(String.valueOf((char)dataItem));
								dataItem = dataInputStream.read();
							}
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
					
				}
			};
			Thread a = new Thread(runnable);
			a.start();
		} catch (IOException e) {
			e.printStackTrace();
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
			// Một Action Listener để gửi tin nhắn đi mỗi khi người dùng ấn nút SEND
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// Kiểm tra xem người dùng nhập tin nhắn hay chưa
				if (txtChat.getText().isEmpty())
					return;
				try {
					history.append(txtChat.getText());
					txtChat.setText("");
				} catch (Exception e) {
					System.out.println("Error while sendding messeger");
				}
			}
		});

	}

}
