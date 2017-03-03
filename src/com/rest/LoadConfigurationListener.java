package com.rest;

import java.util.Map;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import com.bean.Activity;
import com.bean.AppDataBuilder;

public class LoadConfigurationListener implements ServletContextListener {
	private Map<Integer, Activity> dataSourceMap;
    public void contextInitialized(ServletContextEvent sce) {
        ServletContext sc = sce.getServletContext();
        System.out.println("In LoadConfigurationListener");
        dataSourceMap = AppDataBuilder.buildBasicData();
		sc.setAttribute("activityDataSource", dataSourceMap);
    }

    public void contextDestroyed(ServletContextEvent sce) {
        ServletContext context = sce.getServletContext();
        context.removeAttribute("activityDataSource");
        System.out.println("In LoadConfigurationListener destroyed");
    }

}