package com.arrows.mars.feed.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * SpringBoot
 * @author arrows
 */
@Configuration
@ComponentScan(basePackages = "com.arrows.mars")
@EnableTransactionManagement(proxyTargetClass = true)
public class SpringBoot {

    @Autowired
    Environment environment;

    private static AnnotationConfigApplicationContext context;

    protected static void init(){
        context = new AnnotationConfigApplicationContext();
        context.register(SpringBoot.class);
        context.refresh();
    }
}
