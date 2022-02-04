package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.SearchFlightBean;

import java.sql.DriverManager;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SearchFlightDao {

	public Connection con = null;
	public Statement st = null;

	public SearchFlightDao() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/flyme", "root", "root");
		System.out.println("connection established with database");
		st = con.createStatement();
	}

	public List<String[]> getAvailableFlights(String f, String t, String d) {
		List<String[]> flights = new ArrayList<>();

		String query = "SELECT * FROM flyme.flight_details where source_city='" + f + "' and destination_city='" + t
				+ "' and date_travel='" + d + "'";
		System.out.println(query);
		try {
			ResultSet rs = st.executeQuery(query);

			if (rs.next()) {
				String[] flight = new String[5];
				flight[0] = rs.getString("flight_no");
				flight[1] = rs.getString("airline_name");
				flight[2] = rs.getString("price");
				flight[3] = rs.getString("date_travel");
				flight[4] = rs.getString("seat_available");
				
				flights.add(flight);
				return flights;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;
	}
	/*
	 * public boolean validate(SearchFlightBean searchFlightBean) throws
	 * ClassNotFoundException { boolean status = false;
	 * 
	 * Class.forName("com.mysql.jdbc.Driver");
	 * 
	 * try (Connection connection = DriverManager.getConnection(
	 * "jdbc:mysql://localhost:3306/flyme?useSSL=false", "root", "root"); //
	 * Step 2:Create a statement using connection object PreparedStatement
	 * preparedStatement = connection.prepareStatement(
	 * "select * from flight_details where destination_city = ? and source_city  = ? and date_travel  = ? "
	 * )) { preparedStatement.setString(1,
	 * searchFlightBean.getDestination_city()); preparedStatement.setString(2,
	 * searchFlightBean.getSource_city()); preparedStatement.setString(3,
	 * searchFlightBean.getDate_travel());
	 * 
	 * 
	 * preparedStatement.setString(4, searchFlightBean.getAirline_name());
	 * preparedStatement.setString(5, searchFlightBean.getArrival_time());
	 * preparedStatement.setString(6, searchFlightBean.getDeparture_time());
	 * preparedStatement.setInt(7, searchFlightBean.getFlight_no());
	 * preparedStatement.setInt(8, searchFlightBean.getPrice());
	 * preparedStatement.setInt(9, searchFlightBean.getSeat_available());
	 * preparedStatement.setInt(10, searchFlightBean.getTotal_seats());
	 * preparedStatement.setInt(11, searchFlightBean.getBooked_searts());
	 * 
	 * System.out.println(preparedStatement); ResultSet rs =
	 * preparedStatement.executeQuery(); status = rs.next();
	 * 
	 * //while(status){ //String SourceCity=rs.getString("source_city");
	 * //String DestinationCity=rs.getString("destination_city"); //String
	 * TravelDate=rs.getString("date_travel"); //System.out.println(SourceCity +
	 * ", " + DestinationCity + ", " + TravelDate ); //}
	 * 
	 * } catch (SQLException e) { // process sql exception printSQLException(e);
	 * } return status; }
	 * 
	 * private void printSQLException(SQLException ex) { for (Throwable e: ex) {
	 * if (e instanceof SQLException) { e.printStackTrace(System.err);
	 * System.err.println("SQLState: " + ((SQLException) e).getSQLState());
	 * System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
	 * System.err.println("Message: " + e.getMessage()); Throwable t =
	 * ex.getCause(); while (t != null) { System.out.println("Cause: " + t); t =
	 * t.getCause(); } } } }
	 */
}
