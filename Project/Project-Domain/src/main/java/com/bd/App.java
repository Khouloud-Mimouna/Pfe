package com.bd;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	 ApplicationContext ctx1 =new AnnotationConfigApplicationContext(JavaConfig.class) ;
       //ApplicationContext ctx= new  ClassPathXmlApplicationContext("applicationContext.xml");
    }
}
