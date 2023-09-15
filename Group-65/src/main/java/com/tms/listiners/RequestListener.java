package com.tms.listiners;

import jakarta.servlet.ServletRequestEvent;
import jakarta.servlet.ServletRequestListener;
import jakarta.servlet.annotation.WebListener;

@WebListener
public class RequestListener implements ServletRequestListener {
    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        System.out.println("Request Listener start ...");
    }
    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        System.out.println("Request Listener finish ...");
    }

}
