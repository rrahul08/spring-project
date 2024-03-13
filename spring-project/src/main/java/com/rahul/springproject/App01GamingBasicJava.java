package com.rahul.springproject;

import com.rahul.springproject.game.GameRunner;
import com.rahul.springproject.game.MarioGame;
import com.rahul.springproject.game.Pacman;
import com.rahul.springproject.game.superContraGame;

public class App01GamingBasicJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		var game = new MarioGame();
//		var game = new superContraGame();
		var game = new Pacman();
		var gameRunner = new GameRunner(game);
		gameRunner.run();

	}

}
