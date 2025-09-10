package com.tutetude;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/Login")
public class Login extends HttpServlet {
	

	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	
		String uname=req.getParameter("uname");
		String pass=req.getParameter("pass");
		
		if(uname.equals("TuteDude") && pass.equals("password"))
		{
			HttpSession session=req.getSession();
			session.setAttribute("username", uname);
			res.sendRedirect("welcome.jsp");
		}
		else
		{
			
			res.sendRedirect("login.jsp");
		}
	}

	

}
