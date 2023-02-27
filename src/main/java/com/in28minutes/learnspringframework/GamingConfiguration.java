package com.in28minutes.learnspringframework;

import com.in28minutes.learnspringframework.game.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class GamingConfiguration {

    //        var game = new MarioGame();
//        var game = new SuperContraGame();
//        1: Object Creation
//    var game = new PacmanGame();

    @Bean("GamingConsole")
    public GamingConsole game() {
        var game = new PacmanGame();
        return game;
    }

//    @Bean
//    public MarioGame marioGame() {
//        return new MarioGame();
//    }

    @Bean("GameRunner")
    public GameRunner gameRunner() {
        var gameRunner = new GameRunner(game());
        return gameRunner;
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
