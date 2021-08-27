package com.yash;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AssignInter2
 */
@WebServlet("/AssignInter2")
public class AssignInter2 extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
   
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter out=response.getWriter();
		int num1 = (int) (0 + (Math.random() * 10));
		int num2 = (int) (0 + (Math.random() * 10));
		int num3 = (int) (0 + (Math.random() * 10));
		int num4 = (int) (0 + (Math.random() * 10));
		out.println("<BR>four Random number generated are:");
		out.println("<b>" + num1 + " " + num2 + " " + num3 + " " 
			   + num4 + " " + "</b>");
		
	}

}
