package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.LandingBean;
import com.LandingDao;

@WebServlet("/landing")
public class LandingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	 private LandingDao landingDao;

	    public void init() {
	    	landingDao = new LandingDao();
	    }
    public LandingServlet() {
        super();
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        LandingBean landingBean = new LandingBean();
        landingBean.setUsername(username);
        landingBean.setPassword(password);
		
		   try {
	            if (landingDao.validate(landingBean)) {
	                HttpSession session = request.getSession();
	                //session.setAttribute("username",username);
	                //out.println("hello");
	                response.sendRedirect("saerchflights.jsp");
	            } else {
	                HttpSession session = request.getSession();
	                session.setAttribute("user", username);
	                response.sendRedirect("landing.jsp");
	            }
	        } catch (ClassNotFoundException e) {
	            e.printStackTrace();
	        }
	}

}
