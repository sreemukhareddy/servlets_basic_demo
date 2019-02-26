package com.servletbasics.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class AdditionServlet extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		Long num1= Long.parseLong(req.getParameter("number1"));
		Long num2= Long.parseLong(req.getParameter("number2"));
		
		if(num1 == null || num2 == null) {
			num1= 100l;
			num2= 100l;
		}
		
		Long sum= num1+num2;
		
		PrintWriter out= res.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<h1>" + sum +  " is the sum </h1>");
		out.println("</body>");
		out.println("</html>");
		
	}

}
