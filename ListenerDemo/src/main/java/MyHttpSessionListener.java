

import java.util.logging.Logger;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Application Lifecycle Listener implementation class MyHttpSessionListener
 *
 */
@WebListener
public class MyHttpSessionListener implements HttpSessionListener {
	static Logger log=Logger.getAnonymousLogger(); 

    public void sessionCreated(HttpSessionEvent httpSessionEvent)  
    { 
         log.info("session created method has been called in"+this.getClass().getName());
         HttpSession session=httpSessionEvent.getSession();
         log.info(session + "created:");
         log.info("ID="+session.getId()+"MaxInactiveInterval="+session.getMaxInactiveInterval());
    }

    public void sessionDestroyed(HttpSessionEvent httpSessionEvent) 
    { 
        log.info("session destroy method has been called in"+this.getClass().getName());
        HttpSession session=httpSessionEvent.getSession();
        log.info(session + "destroyed:");
        log.info("ID="+session.getId()+"MaxInactiveInterval="+session.getMaxInactiveInterval());

    }
	
}
