package com.in28minutes.learnspringframework;

import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.GamingConsole;
import com.in28minutes.learnspringframework.game.MarioGame;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan("com.in28minutes.learnspringframework.game")
public class GamingConfiguration {


//    @Autowired
//    @Primary
//    public GamingConsole returnGame(MarioGame marioGame) {
//        return marioGame;
//    }

    @Bean("GamingConsole")
    @Primary
    public GamingConsole game() {
        System.out.println("Autowired using Java Beans ");
        var game = new MarioGame();
        GameRunner gameRunner = new GameRunner(game);
        gameRunner.run();
        return game;
    }


}
