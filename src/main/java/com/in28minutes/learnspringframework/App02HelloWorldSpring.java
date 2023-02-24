package com.in28minutes.learnspringframework;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class App02HelloWorldSpring {

    public static void main(String[] args) {
        //1:  Launch a Spring Context
        var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
        //2: Configure the things that we want Spring to manage - @Configuration class
        //HelloWorldConfiguration - @Configuration
        //name - @Bean

        //3: Retrieving Beans managed by Spring

//        for (String s : context.getBeanDefinitionNames()) {
//            System.out.println("----");
//            System.out.println(s);
//
//        }
        System.out.println(context.getBean("name"));
        System.out.println(context.getBean("age"));
        System.out.println(context.getBean("person"));
        System.out.println(context.getBean("address"));


    }

}
