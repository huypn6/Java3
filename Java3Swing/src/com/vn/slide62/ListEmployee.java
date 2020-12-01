package com.vn.slide62;

import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ListEmployee {

	private JFrame frame;
	private JComboBox cboEmployees;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListEmployee window = new ListEmployee();
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
	public ListEmployee() {
		initialize();
		// load combobox employee
		loadComboboxEmployee();
	}

	private void loadComboboxEmployee() {
		EmployeeDAO dao = new EmployeeDAO();
		List<String> employee =  dao.getAllNames();
		for (String string : employee) {
			cboEmployees.addItem(string);
		}
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 30, 100, 28, 108, 59, 0 };
		gridBagLayout.rowHeights = new int[] { 30, 23, 0 };
		gridBagLayout.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, Double.MIN_VALUE };
		frame.getContentPane().setLayout(gridBagLayout);

		JLabel lblDanhSchNhn = new JLabel("Danh s\u00E1ch nh\u00E2n vi\u00EAn");
		GridBagConstraints gbc_lblDanhSchNhn = new GridBagConstraints();
		gbc_lblDanhSchNhn.anchor = GridBagConstraints.EAST;
		gbc_lblDanhSchNhn.insets = new Insets(0, 0, 0, 5);
		gbc_lblDanhSchNhn.gridx = 1;
		gbc_lblDanhSchNhn.gridy = 1;
		frame.getContentPane().add(lblDanhSchNhn, gbc_lblDanhSchNhn);

		cboEmployees = new JComboBox();
		GridBagConstraints gbc_cboEmployees = new GridBagConstraints();
		gbc_cboEmployees.gridwidth = 2;
		gbc_cboEmployees.fill = GridBagConstraints.HORIZONTAL;
		gbc_cboEmployees.insets = new Insets(0, 0, 0, 5);
		gbc_cboEmployees.gridx = 2;
		gbc_cboEmployees.gridy = 1;
		frame.getContentPane().add(cboEmployees, gbc_cboEmployees);

		JButton btnDetail = new JButton("Detail");
		btnDetail.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				loadDetailEmployee();
			}
		});
		GridBagConstraints gbc_btnDetail = new GridBagConstraints();
		gbc_btnDetail.gridx = 4;
		gbc_btnDetail.gridy = 1;
		frame.getContentPane().add(btnDetail, gbc_btnDetail);
	}
	
	private void loadDetailEmployee() {
		// get selected item
		String nameEmployee = (String)cboEmployees.getSelectedItem();
		
		Employee employee = new Employee();
		employee.setTxtUname(nameEmployee);
		
		ShowDetailEmployee showDetailEmployee = new ShowDetailEmployee(employee);
		showDetailEmployee.frame.setVisible(true);
	}

}
