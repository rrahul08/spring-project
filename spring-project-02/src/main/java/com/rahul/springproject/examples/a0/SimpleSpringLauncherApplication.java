package com.rahul.springproject.examples.a0;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan
public class SimpleSpringLauncherApplication {




	public static void main(String[] args) {

		var context = new AnnotationConfigApplicationContext
				      (SimpleSpringLauncherApplication.class);




	}

}
