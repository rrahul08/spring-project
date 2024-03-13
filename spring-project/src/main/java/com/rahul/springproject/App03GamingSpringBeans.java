package com.rahul.springproject;

import com.rahul.springproject.game.GameRunner;
import com.rahul.springproject.game.GamingConsole;
import com.rahul.springproject.game.Pacman;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App03GamingSpringBeans {

	public static void main(String[] args) {

		var context = new AnnotationConfigApplicationContext
				      (GamingConfiguration.class);

		context.getBean(GamingConsole.class).up();
		context.getBean(GameRunner.class).run();


	}

}
