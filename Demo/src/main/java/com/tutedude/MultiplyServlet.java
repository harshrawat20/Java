package com.tutedude;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MultiplyServlet extends HttpServlet {
public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException
{
	int x1=Integer.parseInt(req.getParameter("num1"));
	int x2=Integer.parseInt(req.getParameter("num2"));
	
	int x3=x1*x2;
	
	PrintWriter out =res.getWriter();
	
	out.println("The result is "+x3);
}
}
