package com.github.magdau.springsecurity.demo.config;

import java.util.logging.Logger;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages="com.github.magdau.springsecurity.demo")
@PropertySource("classpath:persistence-mysql.properties") // src/main/resources - files are automatically copied to classpath during Maven build
public class DemoAppConfig {
	
	//set up variable to hold the properties
	@Autowired
	private Environment env; // will hold data read from properties files
	
	//set up a logger for diagnostics
	private Logger logger= Logger.getLogger(getClass().getName());
	
	// define a bean for a ViewRoselwer
	
	@Bean
	public ViewResolver viewResolver() {
		
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		
		viewResolver.setPrefix("/WEB-INF/view/");
		viewResolver.setSuffix(".jsp");
		
		return viewResolver;
	}

	//define a bean for our security datasource
	
	@Bean
	public DataSource securityDataSource() {
		
		//create connection pool
		
		//set the jdb driver class
		
		//log the connection props
		
		//set database connection props
		
		//set connection pool props
	
		
		return null;
	}
}
