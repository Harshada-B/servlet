

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Logger;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet Filter implementation class AuthenticationFilter
 */
@WebFilter("/AuthenticationFilter")
public class AuthenticationFilter implements Filter {

	static Logger log=Logger.getAnonymousLogger(); 
	public void init( FilterConfig config ) throws ServletException
	{
			log.info(" init method is called in "
			                + this.getClass().getName());
	}

	public void doFilter( ServletRequest request, ServletResponse response,
	                FilterChain chain ) throws IOException,
	                ServletException
	{
		HttpServletResponse res=(HttpServletResponse) response;

		log.info(" doFilter method is called in "
			                + this.getClass().getName()+"\n\n");
			
			PrintWriter out = response.getWriter();

			String username = request.getParameter("username");
			String password = request.getParameter("password");
			if( username.equals("admin") && password.equals("admin") )
			{
					// sends request to next resource
					//chain.doFilter(request, response);
				//res.sendRedirect("index.html");
				//log.info("welcome");
				out.println("Welcome");
			}
			else
			{
					out.print("username or password is not correct!");
					//res.sendRedirect("index.html");
			}
	}

	public void destroy()
	{
			// add code to release any resource
		log.info("------------------------------------------------------");
		log.info(" destroy method is called in "
			                + this.getClass().getName());
		log.info("------------------------------------------------------");
	}

}
