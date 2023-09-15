package com.tms.listiners;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;

public class StartApplicationListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("Application Listener starting ...");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("Application Listener finishing ...");
    }
}
