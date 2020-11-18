package com.vn.slide4;

import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.TextArea;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JcomboboxDemo {

	List<Student> list = new ArrayList<Student>();
	private JFrame frame;
	JComboBox comboBox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JcomboboxDemo window = new JcomboboxDemo();
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
	public JcomboboxDemo() {
		initialize();
		list.add(new Student("A", "Nganh2"));
		list.add(new Student("B", "Nganh2"));
		list.add(new Student("C", "Nganh1"));
		list.add(new Student("D", "Nganh1"));
		list.add(new Student("E", "Nganh2"));
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
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);
		
		JLabel lblNgnhHc = new JLabel("Ng\u00E0nh h\u1ECDc");
		GridBagConstraints gbc_lblNgnhHc = new GridBagConstraints();
		gbc_lblNgnhHc.insets = new Insets(0, 0, 5, 5);
		gbc_lblNgnhHc.gridx = 1;
		gbc_lblNgnhHc.gridy = 2;
		frame.getContentPane().add(lblNgnhHc, gbc_lblNgnhHc);
		
		comboBox = new JComboBox();
		for (int i = 0; i < 10; i++) {
			comboBox.addItem("Nganh" + i);
		}
		
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.gridwidth = 2;
		gbc_comboBox.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 2;
		gbc_comboBox.gridy = 2;
		frame.getContentPane().add(comboBox, gbc_comboBox);
		
		JButton btnLc = new JButton("L\u1ECDc");
		btnLc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//get selected item
				String major = (String)comboBox.getSelectedItem();
				List<Student> result = list.stream().filter(x -> {
					return (x.getMajor() == major);
				}).collect(Collectors.toList());
				for (Student student : result) {
					System.out.println(student.getStudent());
				}
			}
		});
		GridBagConstraints gbc_btnLc = new GridBagConstraints();
		gbc_btnLc.insets = new Insets(0, 0, 5, 0);
		gbc_btnLc.gridx = 3;
		gbc_btnLc.gridy = 4;
		frame.getContentPane().add(btnLc, gbc_btnLc);
		
		TextArea textArea = new TextArea();
		GridBagConstraints gbc_textArea = new GridBagConstraints();
		gbc_textArea.gridwidth = 4;
		gbc_textArea.gridx = 0;
		gbc_textArea.gridy = 5;
		frame.getContentPane().add(textArea, gbc_textArea);
	}

}
