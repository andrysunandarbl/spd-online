/**
 * Innovez-One, Proprietary Software Cloud Communications
 *  Copyright (c) 2015, Innovez-One and individual contributors
 *  by the @authors tag.
 *
 *  This program is Proprietary Software: you can not redistribute it and/or modify
 *  without license from Innovez-One.
 *
 *  Website : http://www.innovez-one.com/
 *  Report bugs to <techsupport@innovez-one.com>.
 *  Copyright (C) 2015 PT. Innovez-One. All rights reserved.
 */
package com.lemigas.blu.spd.config;


import com.lemigas.blu.spd.utils.PropertiesLoader;
import com.lemigas.blu.spd.utils.ResourceProperties;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import java.util.Properties;

/**
 * Author andry on 28/11/16.
 */


public class WebAppInitalizer extends AbstractAnnotationConfigDispatcherServletInitializer {

    private static final PropertiesLoader propertiesLoader = new PropertiesLoader();

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[]{AppConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[]{ ThymeleafConfig.class };
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

    @Override
    protected WebApplicationContext createRootApplicationContext() {
        WebApplicationContext context = super.createRootApplicationContext();
        Properties properties = propertiesLoader.load(ResourceProperties.SPRING_PROPERTIES_FILE);
        ((ConfigurableEnvironment) context.getEnvironment()).setActiveProfiles(
                properties.getProperty("spring.profiles.active"));
        return context;
    }
}
