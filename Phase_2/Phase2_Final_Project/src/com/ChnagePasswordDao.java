package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ChnagePasswordDao {
	public Connection con = null;
	public Statement st = null;

	public ChnagePasswordDao() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/flyme", "root", "root");
		System.out.println("connection established with database");
		st = con.createStatement();
	}
public boolean changeAdminPassword(String username, String password) {

		try {
			ResultSet rs=st.executeQuery("select * from admin where username='"+username+"'");
			if(!rs.next()) {
				return false;
			}
			st.execute("update admin set password='"+password+"' where username='"+username+"'");
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
}
