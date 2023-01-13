package com.designpatterns.strategy;

public class Robot {

    private Behavior strategy;

    public Behavior getStrategy() {
        return strategy;
    }

    public void setStrategy(Behavior strategy) {
        this.strategy = strategy;
    }

    public void move(){
        this.strategy.move();
    }
    
}
