package com.ty;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Person {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/mypersondet","root","root");
			Statement statement= connection.createStatement();
			statement.execute("insert into person values(206,'Pavankumar',22,'male','pavamkumar@gmail.com')");
			connection.close();
			System.out.println("Data saved");

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
