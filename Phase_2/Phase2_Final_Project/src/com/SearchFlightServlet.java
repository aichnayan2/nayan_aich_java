package com;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/SearchFlightsServlet")
public class SearchFlightServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String source_city = request.getParameter("source_city");
		String destination_city = request.getParameter("destination_city");
		String date_travel = request.getParameter("date_travel");

		try {
			SearchFlightDao dao = new SearchFlightDao();
			List<String[]> flights = dao.getAvailableFlights(source_city, destination_city, date_travel);
			HttpSession session = request.getSession();
			session.setAttribute("flights", flights);

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		response.sendRedirect("flight_details.jsp");

		/*
		 * PrintWriter out = response.getWriter();
		 * 
		 * String destination_city = request.getParameter("destination_city");
		 * String source_city = request.getParameter("source_city"); String
		 * date_travel = request.getParameter("date_tavel"); //String noPerson
		 * =request.getParameter("NoPerson");
		 * 
		 * SearchFlightBean searchFlightBean = new SearchFlightBean();
		 * searchFlightBean.setDestination_city(destinationCity);
		 * searchFlightBean.setSource_city(sourceCity);
		 * searchFlightBean.setDate_travel(travelDate);
		 * 
		 * try { if (searchFlightDao.validate(searchFlightBean)) { HttpSession
		 * session = request.getSession();
		 * session.setAttribute("destinationCity",destinationCity);
		 * session.setAttribute("sourceCity",sourceCity);
		 * session.setAttribute("travelDate",travelDate); out.println("hello");
		 * response.sendRedirect("flight_details.jsp"); } else { //HttpSession
		 * session = request.getSession(); //session.setAttribute("user",
		 * username); //response.sendRedirect("landing.jsp"); } } catch
		 * (ClassNotFoundException e) { e.printStackTrace(); }
		 */
	}

}