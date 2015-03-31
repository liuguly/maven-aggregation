/*******************************************************************************
 * Copyright (c) 2005, 2014 springside.github.io
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 *******************************************************************************/
package com.lx.myproject.example;

import java.io.IOException;
import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author xin
 */
public class StartServer {

	private static final String DEFAULT_SPRING_CONFIG = "applicationContext.xml";

	private static ClassPathXmlApplicationContext context ;
	
	private static Scanner scanner ;
	
	private static void initSpringContainer(){
		context = new ClassPathXmlApplicationContext();
		context.getEnvironment().setActiveProfiles(Profiles.DEVELOPMENT.name().toLowerCase());
		context.setConfigLocation(DEFAULT_SPRING_CONFIG);
		context.refresh();
	}
	
	private static void closeSpringContainer(){
		if(context!=null){
			context.close();
		}
	}
	
	public static void main(String[] args) throws IOException {
		
		initSpringContainer();
		
		context.start();
		
		System.out.println("you can close spring container by input shutdown command");
		
        while(true){
        	scanner  = new Scanner(System.in);
        	if("shutdown".equalsIgnoreCase(scanner.next())){
        		scanner.close();
        		break;
        	}
        }
        
        closeSpringContainer();
	}
	
	
	enum Profiles{
		
		PRODUCTION,DEVELOPMENT,FUNCTINAL,TEST
		
	}
	
}
