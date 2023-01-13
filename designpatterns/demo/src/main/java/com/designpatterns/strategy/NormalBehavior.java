package com.designpatterns.strategy;

public class NormalBehavior implements Behavior {

    @Override
    public void move() {
        System.out.println("I'm walking slowly...");
    }

   
}
