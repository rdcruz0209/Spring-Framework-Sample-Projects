package com.in28minutes.learnspringframework;

import com.in28minutes.learnspringframework.game.*;

public class App01GamingBasicJava {

    public static void main(String[] args) {
        var game1 = new MarioGame();
        var game = new SuperContraGame();
//        var game = new PacmanGame();

        GameRunner gameRunner = new GameRunner(game);


        gameRunner.run();


    }

}
