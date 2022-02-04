package com;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class BookFlightDao {

	public Connection con = null;
	public Statement st = null;

	public BookFlightDao() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/flyme", "root", "root");
		System.out.println("connection established with database");
		st = con.createStatement();
	}
	
	public boolean insertUser(HashMap<String, String> user) {

		String query="INSERT INTO booking_details(email, name, address, age, mobile, ID, country) values('"+user.get("email")+"','"+user.get("name")+"','"+user.get("address")+"','"+user.get("age")+"','"+user.get("mobile")+"','"+user.get("ID")+"','"+user.get("country")+"')";                   
		System.out.println(query);
		try {
			st.execute(query);
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
}
