package com.tutedude;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class MultiplyServlet extends HttpServlet {
public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException
{
//	int x1=Integer.parseInt(req.getParameter("num1"));
//	int x2=Integer.parseInt(req.getParameter("num2"));
//	
//	int x3=x1*x2;
	
//	req.setAttribute("x3", x3);
	
	//Using session
//	PrintWriter out=res.getWriter();
//	HttpSession session=req.getSession();
//	session.setAttribute("x3", x3);
//RequestDispatcher rd=req.getRequestDispatcher("cube");
//rd.forward(req,res);

	//using cookie:
//	Cookie cookie=new Cookie("x3",x3+"");
//	res.addCookie(cookie);
//	
//	//Cookies don't work on request dispatcher as they work on response not request
//	res.sendRedirect("cube");
	
	//using url rewriting
//	res.sendRedirect("cube?x3="+x3);
	
	
	
	
//	//Servlet Config
//	
//	PrintWriter out =res.getWriter();
//	out.println("Hello ");
//	
//	ServletConfig sgcf=getServletConfig();
//	
//	String name=sgcf.getInitParameter("name");
//	out.println(name);
//	
	
	//Servlet Context
//	PrintWriter out=res.getWriter();
//	out.print("Hello ");
//	
//	ServletContext sc=getServletContext();
//	String name=sc.getInitParameter("name");
//	out.println(name);
	
	
	//Filter 
	PrintWriter out =res.getWriter();
	out.append("Hello ");
	ServletContext cntx=getServletContext();
	String name=cntx.getInitParameter("name");
	out.println(name);
	
	
	
}
}
