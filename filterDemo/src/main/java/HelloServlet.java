

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	static Logger log=Logger.getAnonymousLogger(); 
	public void init() throws ServletException
	{
		log.info("------------------------------------------------------");
		log.info(" Init method is called in "
				+ this.getClass().getName());
		log.info("------------------------------------------------------");
	}

	public void doGet( HttpServletRequest request,
			HttpServletResponse response ) throws ServletException,
	IOException
	{

		log.info(" doGet method is called in "
				+ this.getClass().getName() + "\n\n");
		log.info("------------------------------------------------------");

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		//out.println("welcome");
		out.print("<br>welcome to helloservlet<br>");

	}

	public void destroy()
	{
		log.info("------------------------------------------------------");
		log.info(" destroy method is called in "
				+ this.getClass().getName());
		log.info("------------------------------------------------------");
	}

}
