package com.vn.slide62;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {

	public List<String> getAllNames() {
		List<String> usenames = new ArrayList();
		try {
			// 1. Connection database
			Class.forName("com.mysql.cj.jdbc.Driver");

			String url = "jdbc:mysql://localhost:3306/jdbcdemo?serverTimezone=UTC";
			String uname = "root";
			String upass = "";
			Connection connection = DriverManager.getConnection(url, uname, upass);

			// 2. CreatE Statement
			Statement statement = connection.createStatement();

			// 3. Select uname from Employee => ResultSet
			ResultSet rs = statement.executeQuery("Select uname from Employee");

			
			// 4. Show uname => Combobox
			while (rs.next()) {
				String nameEmployee = rs.getString(1);
				usenames.add(nameEmployee);
			}
			
			// 5. Close connection
			rs.close();
			statement.close();
			connection.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return usenames;
	}
}
