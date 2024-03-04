package com.dgmf.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class DispatcherServetInitializer
        extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        // Defining Beans Configuration Class
        return new Class[]{AppConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        // DispatcherServlet Will Handle All the
        // Endpoints Starting By "/"
        return new String[]{"/"};
    }
}
