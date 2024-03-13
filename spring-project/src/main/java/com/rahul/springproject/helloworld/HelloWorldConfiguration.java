package com.rahul.springproject.helloworld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age, Address address){ }
record Address(String firstline,String city) {}

@Configuration
public class HelloWorldConfiguration {
	
	@Bean
	public String name() {
		return "rahul";
		
	}
	
	@Bean
	public int age() {
		return 22;
		
	}

	@Bean
	public Person person1(String name,int age,Address address){
		return new Person(name,age,address);
	}

	@Bean
	public Person person2(){
		return new Person(name(),age(),address());
	}

	@Bean
	public Address address(){
		return new Address("D.no.9,Jk nagar 1st street","Coimbatore");
	}
	

}
