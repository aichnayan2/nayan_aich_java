package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.AdminBean;
import com.AdminDao;


public class AdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 private AdminDao adminDao;

	    public void init() {
	    	adminDao = new AdminDao();
	    }
 public AdminServlet() {
     super();
 }
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        AdminBean adminBean = new AdminBean();
        adminBean.setUsername(username);
        adminBean.setPassword(password);
		
		   try {
	            if (adminDao.validate(adminBean)) {
	                HttpSession session = request.getSession();
	                //session.setAttribute("username",username);
	                //out.println("hello");
	                response.sendRedirect("adminWelcome.jsp");
	            } else {
	                //HttpSession session = request.getSession();
	                //session.setAttribute("user", username);
	                response.sendRedirect("admin.jsp");
	            }
	        } catch (ClassNotFoundException e) {
	            e.printStackTrace();
	        }
	}

}