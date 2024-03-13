package com.rahul.springproject.examples.f1;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
class ClassA{

	private Dependency dependency;

	public ClassA(Dependency dependency) {
		this.dependency = dependency;
		System.out.println("All dependencies are ready");
	}

	@PostConstruct
	public void initialize(){
		dependency.getReady();
	}

	@PreDestroy
	public void cleanup(){
		System.out.println("Cleanup");
	}
}

@Component
class Dependency{

	public void getReady() {
		System.out.println("Get ready");
	}
}


@Configuration
@ComponentScan
public class PostconstructPredestroycontextApplication {




	public static void main(String[] args) {

		var context = new AnnotationConfigApplicationContext
				(PostconstructPredestroycontextApplication.class);




	}

}
