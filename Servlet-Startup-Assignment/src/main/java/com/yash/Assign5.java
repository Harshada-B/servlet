package com.yash;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Assign5
 */
@WebServlet("/Assign5")
public class Assign5 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Assign5() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		int n1=0,n2=1,n3,i,count=10;  
		 out.println(n1+" "+n2);//printing 0 and 1  
		  
		 for(i=2;i<count;++i)
		 {  
		  n3=n1+n2;  
		  out.println(" "+n3);  
		  n1=n2;  
		  n2=n3;  
		 }  
	}

}
