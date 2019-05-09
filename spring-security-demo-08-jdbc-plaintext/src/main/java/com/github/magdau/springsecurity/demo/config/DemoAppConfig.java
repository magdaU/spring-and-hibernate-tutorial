package com.github.magdau.springsecurity.demo.config;

import java.beans.PropertyVetoException;
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

import com.mchange.v2.c3p0.ComboPooledDataSource;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.github.magdau.springsecurity.demo")
@PropertySource("classpath:persistence-mysql.properties") // src/main/resources - files are automatically copied to
															// classpath during Maven build
public class DemoAppConfig {

	// set up variable to hold the properties
	@Autowired
	private Environment env; // will hold data read from properties files

	// set up a logger for diagnostics
	private Logger logger = Logger.getLogger(getClass().getName());

	// define a bean for a ViewRoselwer

	@Bean
	public ViewResolver viewResolver() {

		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();

		viewResolver.setPrefix("/WEB-INF/view/");
		viewResolver.setSuffix(".jsp");

		return viewResolver;
	}

	// define a bean for our security datasource

	@Bean
	public DataSource securityDataSource() {

		// create connection pool
		ComboPooledDataSource securityDataSource = new ComboPooledDataSource();

		// set the jdb driver class
		try {
			securityDataSource.setDriverClass(env.getProperty("jdbc.driver"));
		} catch (PropertyVetoException exc) {
			throw new RuntimeException(exc);
		}

		// log the connection props
		// for sanity's sake, log this info
		// just to make sure we are Really reading data from properties file
		logger.info(">>>jdbc.url=" + env.getProperty("jdbc.url"));
		logger.info(">>>jdbc.user=" + env.getProperty("jdbc.user"));

		// set database connection props
		securityDataSource.setJdbcUrl(env.getProperty("jdbc.url"));
		securityDataSource.setUser(env.getProperty("jdbc.user"));
		securityDataSource.setPassword(env.getProperty("jdbc.password"));

		// set connection pool props
		securityDataSource.setInitialPoolSize(getIntProperty("connection.pool.initialPoolSize"));

		securityDataSource.setInitialPoolSize(getIntProperty("connection.pool.minPoolSize"));

		securityDataSource.setInitialPoolSize(getIntProperty("connection.pool.maxPoolSize"));

		securityDataSource.setInitialPoolSize(getIntProperty("connection.pool.maxIdleTime"));

		return securityDataSource;
	}

	// nedd a helper method
	// read environemnt property and convert to int

	private int getIntProperty(String propName) {
		String propVal = env.getProperty(propName);

		// now convert to int
		int intPropVal = Integer.parseInt(propVal);

		return intPropVal;
	}
}
