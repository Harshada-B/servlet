

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Insertservlet")
public class Insertservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
protected void doPost(HttpServletRequest request, 
			 HttpServletResponse response) throws IOException
	 {
		 response.setContentType("text/html");
		 PrintWriter out= response.getWriter();

		 String id = request.getParameter("id");
		 String addr = request.getParameter("addr");

		 try
		 {
		 Class.forName("com.mysql.jdbc.Driver");
		 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demoproject","root","root");
		 PreparedStatement ps=con.prepareStatement("insert into demo values(?,?)");
		 ps.setString(1,id);
		 ps.setString(2, addr);
		 int i =ps.executeUpdate();

		 if(i > 0)
		 {
		 out.println("inserted");
		 }

	 }
		 catch(Exception e)
		 {
			 out.println("error"+e);
		 }
	}
}
