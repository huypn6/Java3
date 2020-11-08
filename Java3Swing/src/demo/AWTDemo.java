package demo;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class AWTDemo extends JFrame {
	
	Button red, blue;
	Label state;
	
	public static void main(String[] args) {
		AWTDemo awtDemo = new AWTDemo("Poly");
		awtDemo.setSize(450, 200);
		awtDemo.setVisible(true);
		awtDemo.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public AWTDemo(String title) {
		this.setTitle(title);
		initComponent();
	}

	private void initComponent() {
		//0. set layout
		this.setLayout(new FlowLayout());
		
		//1. Create
		red = new Button("Red");
		red.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				changeBackGround(e);
			}
		});
		blue = new Button("Blue");
		blue.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				changeBackGround(e);
			}
		});
		state = new Label("");
		//2. add 
		this.getContentPane().add(red);
		this.getContentPane().add(blue);
		this.getContentPane().add(state);
	}
	
	private void changeBackGround(ActionEvent e) {
		String action = e.getActionCommand();
		switch (action) {
		case "Blue":
			this.getContentPane().setBackground(Color.BLUE);
			state.setText("Ban click blue");
			break;
		case "Red":
			this.getContentPane().setBackground(Color.RED);
			state.setText("Ban click red");
			break;
		default:
			break;
		}
	}
	
}
