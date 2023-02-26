package com.in28minutes.learnspringframework;

import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.PacmanGame;


public class App03GamingSpringBeans {

    public static void main(String[] args) {
//        var game = new MarioGame();
//        var game = new SuperContraGame();
//        1: Object Creation
        var game = new PacmanGame();

//        2: Object Creating + Wiring of Dependencies
//        Game is a Dependency of GameRunner

        GameRunner gameRunner = new GameRunner(game);


        gameRunner.run();


    }

}
