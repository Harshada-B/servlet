

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.util.logging.Logger;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

/**
 * Servlet Filter implementation class LogFilter
 */
@WebFilter("/LogFilter")
public class LogFilter implements Filter {
static Logger log=Logger.getAnonymousLogger(); 
	public void init(FilterConfig fConfig) throws ServletException {
		log.info("---------------------------------------");
		log.info("init method is called in"+this.getClass().getName());
		log.info("---------------------------------------");
	}
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException 
	{
		log.info("dofilter method is called in"+this.getClass().getName());
		PrintWriter out=response.getWriter();
		//get ip address of client machine
		String ipAddress=request.getRemoteAddr();
		//log the ip address
		log.info("IP"+ipAddress+", Time"+new Date(0).toString());
		out.println("log filter is invoked before");
		out.println("IP"+ipAddress+", Time"+new Date(0).toString()+"<br>");
		chain.doFilter(request, response);
	}

	
	public void destroy() {
		//add code to realese
		log.info("------------------------------------------------------");
		log.info("destroy method is called in"+this.getClass().getName());
		log.info("------------------------------------------------------");

	}


}
