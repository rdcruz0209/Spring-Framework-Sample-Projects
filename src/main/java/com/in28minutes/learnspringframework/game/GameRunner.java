package com.in28minutes.learnspringframework.game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {

    private final GamingConsole game;

    /*            tightly coupled
        private MarioGame marioGame;
        public GameRunner(MarioGame marioGame) {
            this.marioGame = marioGame;
        }*/
    @Autowired
    public GameRunner(GamingConsole game) {
        System.out.println("\nAutowired using GamingConsole Bean " + game);
        this.game = game;

    }

    public void run() {
        System.out.println("Running game " + game);
        game.up();
        game.down();
        game.left();
        game.right();

    }


}
