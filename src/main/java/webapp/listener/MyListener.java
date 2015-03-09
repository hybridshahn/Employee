package webapp.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationContext;

/**
 * Application Lifecycle Listener implementation class MyListener
 *
 */
public class MyListener implements ServletContextListener {
	static Log log = LogFactory.getLog(MyListener.class);

    /**
     * Default constructor. 
     */
    public MyListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent sce)  { 
    		log.info("#####################");
    		log.info("contextDestroyed(..)");
    		log.info("#####################");
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent sce)  { //초기화 작업을 여기서.
	    	log.info("#####################");
			log.info("contextInitialized(..)");
			log.info("#####################");
			//spring을안쓰고 db를쓰려면 리스너에서 해야한다
			
			ServletContext application = sce.getServletContext(); //jsp에서말하는 어플리케이션이 ServletContext얘야.
			
			String className = application.getInitParameter("className");
			String url = application.getInitParameter("url");
			String user = application.getInitParameter("user");
			String password = application.getInitParameter("password");
			String location = application.getInitParameter("contextConfigLocation");
			
			log.info("className="+className);
			log.info("url="+url);
			log.info("user="+user);
			log.info("password="+password);
			log.info("contextConfigLocation="+location);
			//리스너가뭔지 연습하는중임. 
    }
	
}
