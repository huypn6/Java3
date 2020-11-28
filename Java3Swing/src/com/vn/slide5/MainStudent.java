package com.vn.slide5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class MainStudent {

	public static void main(String[] args) {
//		selectAll();
		selectById(1);
	}
	
	void delete() {
	}

	void update() {
	}

	void create() {
	}
	
	static void selectById(int idParam) {
		try {
			//3.1/ Tạo Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//3.2 Create connection
			String url = "jdbc:mysql://localhost:3306/jdbcdemo?serverTimezone=UTC";
			String password = "";
			String username = "root";
			Connection connection = DriverManager.getConnection(url, username, password);
			
			//3.3 Create Statement
			PreparedStatement statement = connection.prepareStatement("Select * from Student where id = ?");
			statement.setInt(1, idParam);
			ResultSet resultSet = statement.executeQuery();
			
//			ResultSet resultSet = statement.getResultSet();
			
			//3.5 get data from DB
			while (resultSet.next()) {
				Integer id = resultSet.getInt(1);
				String name = resultSet.getString(2);
				System.out.println(id);
				System.out.println(name);
			}
			
			//3.6
//			resultSet.close();
//			statement.close();
			connection.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	

	static void selectAll() {
		try {
			//3.1/ Tạo Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//3.2 Create connection
			String url = "jdbc:mysql://localhost:3306/jdbcdemo?serverTimezone=UTC";
			String password = "";
			String username = "root";
			Connection connection = DriverManager.getConnection(url, username, password);
			
			//3.3 Create Statement
			Statement statement = connection.createStatement();
			statement.execute("Select * from Student");
			
			ResultSet resultSet = statement.getResultSet();
			
			//3.5 get data from DB
			while (resultSet.next()) {
				Integer id = resultSet.getInt(1);
				String name = resultSet.getString(2);
				System.out.println(id);
				System.out.println(name);
			}
			
			//3.6
//			resultSet.close();
//			statement.close();
			connection.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
