package com.in28minutes.learnspringframework;

import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.GamingConsole;
import com.in28minutes.learnspringframework.game.PacmanGame;
import com.in28minutes.learnspringframework.helloworld.HelloWorldConfiguration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;


public class App03GamingSpringBeans {

    public static void main(String[] args) {

        try (var context =
                     new AnnotationConfigApplicationContext
                             (GamingConfiguration.class)) {

//            context.getBean(GamingConsole.class).up();
//            context.getBean(GameRunner.class).run();
            context.getBean("GamingConsole");
            context.getBean(GameRunner.class).run();
        }

//        GameRunner gameRunner = new GameRunner(game);


    }

}
