package com.in28minutes.learnspringframework.game;

public class PacmanGame implements GamingConsole {

    public void up() {
        System.out.println("Going up and eating upwards");
    }

    public void down() {
        System.out.println("Going down and eating downwards");

    }

    public void left() {
        System.out.println("Going left and eating left");

    }

    public void right() {
        System.out.println("Going right and eating right");

    }

    @Override
    public String toString() {
        return PacmanGame.class.toString();
    }
}
