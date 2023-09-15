package com.tms.Konfig;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class DispatcherServletInit extends AbstractAnnotationConfigDispatcherServletInitializer {

    /** Классы, которые поднимают нужные нам бины */
    @Override
    protected Class<?>[] getRootConfigClasses() {

        return null;
    }
    /** наш ViewResolver */
    @Override
    protected Class<?>[] getServletConfigClasses() {

        return new Class[]{SpringConfig.class};
    }
    /**На какие url  отвечает */
    @Override
    protected String[] getServletMappings() {

        return new String[]{"/"};
    }
}

