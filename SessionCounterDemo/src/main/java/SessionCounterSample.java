import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/SessionCounterSample")
public class SessionCounterSample extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		boolean create=true;//get session object
		
		HttpSession session=request.getSession(create);
		
		//get session data
		Integer counter=(Integer) session.getAttribute("myCounter");
		if(counter==null) {
			counter=1;
		}else
		{
			counter++;
		}
		session.setAttribute("myCounter", counter);
		//step3:output the page
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<html>");
		out.println("<head><title>Session Tracking Demo</title></head>");
		out.println("<body>");
		out.println("<h1>Session Tracking Counter Sample app</h1>");
		out.println("you have hit this page:"+counter+"times <br>");
		out.println("your session cookie:"+request.getHeader("cookie"));
		out.println("<br> your session id:"+session.getId());
		
		out.println("</body>");
		out.println("</html>");
	}

}
