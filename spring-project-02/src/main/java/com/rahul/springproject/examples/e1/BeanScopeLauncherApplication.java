package com.rahul.springproject.examples.e1;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
class ClassA{

}

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
class ClassB{

}


@Configuration
@ComponentScan
public class BeanScopeLauncherApplication {




	public static void main(String[] args) {

		var context = new AnnotationConfigApplicationContext
				      (BeanScopeLauncherApplication.class);

		System.out.println(context.getBean(ClassA.class));
		System.out.println(context.getBean(ClassA.class));


		System.out.println(context.getBean(ClassB.class));
		System.out.println(context.getBean(ClassB.class));
		System.out.println(context.getBean(ClassB.class));


	}

}
