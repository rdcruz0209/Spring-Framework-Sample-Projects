package com.in28minutes.learnspringframework.game;

import org.springframework.boot.autoconfigure.SpringBootApplication;


public class GameRunner {

    private GamingConsole game;
//    private GamingConsole game2;
//    private GamingConsole game3;

    public GameRunner(GamingConsole game) {
        this.game = game;
    }


    public void run() {
        System.out.println("\nRunning game " + game);
        game.up();
        game.down();
        game.left();
        game.right();

    }


}
