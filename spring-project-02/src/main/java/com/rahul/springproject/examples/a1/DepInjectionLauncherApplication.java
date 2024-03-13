package com.rahul.springproject.examples.a1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
class Yourbusinessclass{

	Dependency1 dependency1;


	Dependency2 dependency2;

//	Field Injection


	//Setter injection

//    @Autowired
//	public void setDependency1(Dependency1 dependency1) {
//		this.dependency1 = dependency1;
//	}
//
//	@Autowired
//	public void setDependency2(Dependency2 dependency2) {
//		this.dependency2 = dependency2;
//	}

	//Constructor injection


	public Yourbusinessclass(Dependency1 dependency1, Dependency2 dependency2) {
		this.dependency1 = dependency1;
		this.dependency2 = dependency2;
	}

	public String toString(){
		return "Using"+ dependency1 + "and" + dependency2;
	}
}
@Component
class Dependency1{

}
@Component
class Dependency2{

}



@Configuration
@ComponentScan
public class DepInjectionLauncherApplication {




	public static void main(String[] args) {

		var context = new AnnotationConfigApplicationContext
				      (DepInjectionLauncherApplication.class);

		//Field injection
		System.out.println(context.getBean(Yourbusinessclass.class));




	}

}
