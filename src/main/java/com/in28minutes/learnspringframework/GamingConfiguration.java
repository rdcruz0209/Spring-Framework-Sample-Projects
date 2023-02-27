package com.in28minutes.learnspringframework;

import com.in28minutes.learnspringframework.game.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Scanner;

@Configuration
public class GamingConfiguration {

    @Bean("GameRunner")
    public GameRunner gameRunner() {
        var gameRunner = new GameRunner(game());
        return gameRunner;
    }

    @Bean("GamingConsole")
    public GamingConsole game() {
        Scanner input = new Scanner((System.in));
        GamingConsole game = null;
        int choice = input.nextInt();
        switch (choice) {
            case 1:
                game = new SuperContraGame();
                break;
            case 2:
                game = new MarioGame();
                break;
            case 3:
                game = new PacmanGame();
                break;
            default:
                System.out.println("Game does not exist");
                break;
        }


        return game;
    }


//    @Bean
//    @Primary
//    public GamingConsole game2() {
//        var game = new SuperContraGame();
//        return game;
//    }

//        2: Object Creating + Wiring of Dependencies
//        Game is a Dependency of GameRunner
//    GameRunner gameRunner = new GameRunner(game);
//
//
//        gameRunner.run();

}
