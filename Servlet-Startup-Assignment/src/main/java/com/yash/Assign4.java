package com.yash;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Assign4
 */
@WebServlet("/Assign4")
public class Assign4 extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public Assign4() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter pw=response.getWriter();
		int n1=Integer.parseInt(request.getParameter("num1"));
		int n2=Integer.parseInt(request.getParameter("num2"));
		int sum=n1+n2;
		pw.println("Addition of two no is:"+sum);
	}

	
}
