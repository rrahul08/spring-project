package com.rahul.springproject.helloworld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class App02HelloWorldSpring {

    public static void main(String[] args) {

        try(var context =
                    new AnnotationConfigApplicationContext
                            (HelloWorldConfiguration.class) ){

           
            
            System.out.println(context.getBean("name"));
            System.out.println(context.getBean("age"));
            System.out.println(context.getBean("address"));
            System.out.println(context.getBean("person1"));
            System.out.println(context.getBean("person2"));


        }
    }
}
