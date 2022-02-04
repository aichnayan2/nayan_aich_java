package com;

import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.sql.SQLException;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.BookFlightDao;


public class BookFlightServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email=request.getParameter("email");
		String name=request.getParameter("name");
		String address=request.getParameter("address");
		String age=request.getParameter("age");
		String mobile=request.getParameter("mobile");
		String ID=request.getParameter("ID");
		String country=request.getParameter("country");
		System.out.println(email);
		
		HashMap<String,String> user=new HashMap<>();
		user.put("email", email);
		user.put("name", name);
		user.put("address", address);
		user.put("age", age);
		user.put("mobile", mobile);
		user.put("ID", ID);
		user.put("country", country);
		
		try {
			BookFlightDao dao=new BookFlightDao();
			boolean result=dao.insertUser(user);
			HttpSession session=request.getSession();
			if(result) {
				session.setAttribute("message", "User Added Successfully");
			}
			else {
				session.setAttribute("message","Invalid Details");
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		response.sendRedirect("review_details.jsp");
	}
}
