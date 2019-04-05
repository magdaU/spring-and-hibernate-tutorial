package com.github.magdau.aopdemo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Configuration  // Spring pure Java configuration
@EnableAspectJAutoProxy  // Spring AOP Proxy Support
@ComponentScan("com.github.magdau.aopdemo") // Component Scan for component and aspect (recurse package)
public class DemoConfig {

}
