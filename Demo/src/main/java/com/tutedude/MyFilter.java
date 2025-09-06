package com.tutedude;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.*;

public class MyFilter implements Filter{

	FilterConfig config;
	
	@Override
	public void init(FilterConfig config )throws ServletException{
		System.out.println("Init method called!");
		this.config=config;
	}
	
	@Override
	public void doFilter(ServletRequest req,ServletResponse res,FilterChain chain) throws IOException, ServletException {
		res.setContentType("text/html");
		PrintWriter out =res.getWriter();
		
		if(config.getInitParameter("name").equals("tutedude"))
		{
			chain.doFilter(req,res); //used to move forward to the next place where work has to be done
		}
		else
		{
			out.println("Wrong username");
		}
		
	}
	
	@Override
	public void destroy() {
		System.out.println("Destroy method called !");
	}
	
}
