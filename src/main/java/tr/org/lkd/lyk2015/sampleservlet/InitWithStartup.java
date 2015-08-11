package tr.org.lkd.lyk2015.sampleservlet;


import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class InitWithStartup implements ServletContextListener {


    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.out.println("InitWithStartup.contextInitialized");
        CreateTest ct = new CreateTest();
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
