package com.tutedude;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class CubedServlet extends HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		//int x3=(int)req.getAttribute("x3");
		
		//using session
//		HttpSession session=req.getSession();
//		int x3=(int)session.getAttribute("x3");
		
		
		//using cookie
//		int x3=0;
//		Cookie cookie[]=req.getCookies();//It returns an arary of all the cookie in the system or req
//		for(Cookie cook:cookie)
//		{
//			if(cook.getName().equals("x3"))
//				x3=Integer.parseInt(cook.getValue());
//		}
		
		
		//using url redirect
		int x3=Integer.parseInt(req.getParameter("x3"));
		
		
		x3=x3*x3*x3;
		PrintWriter out=res.getWriter();
		out.println("the value :"+x3);
		
	}
}
