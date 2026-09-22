package in.strikes;

import in.strikes.config.WebConfig;
import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import java.io.File;

public class Main {
    public static void main(String[] args) throws LifecycleException {
//  Boiler plate code
        Tomcat tomcat = new Tomcat();

        tomcat.setPort(8080);

        tomcat.getConnector();

        String contextPath = "";
        String baseDoc = new File("src/main/webapp").getAbsolutePath();

        Context context =  tomcat.addContext(contextPath,baseDoc);

//        IOC Container up
        AnnotationConfigWebApplicationContext springContext = new AnnotationConfigWebApplicationContext();

        springContext.register(WebConfig.class);

//        Dispatcher Servlets
        DispatcherServlet dispatcherServlet = new DispatcherServlet(springContext);

        Tomcat.addServlet(context,"dispatcherServlet",dispatcherServlet);

        context.addServletMapping("/","dispatcherServlet");

        tomcat.start();

        System.out.println("Tomcat is started on port : 8080");

        //keep server running
        tomcat.getServer().await();
    }
}