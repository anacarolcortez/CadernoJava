package com.designpatterns;

import com.designpatterns.facade.Facade;
import com.designpatterns.singleton.SingletonEager;
import com.designpatterns.singleton.SingletonLazy;
import com.designpatterns.singleton.SingletonLazyHolder;
import com.designpatterns.strategy.Behavior;
import com.designpatterns.strategy.DefensiveBehavior;
import com.designpatterns.strategy.NormalBehavior;
import com.designpatterns.strategy.Robot;

public class Test 
{
    public static void main( String[] args )
    {
        //teste Singleton
        SingletonLazy lazy = SingletonLazy.getInstance();
        System.out.println(lazy);

        SingletonLazy sameLazy = SingletonLazy.getInstance();
        System.out.println(sameLazy);

        SingletonEager eager = SingletonEager.getInstance();
        System.out.println(eager);

        SingletonEager sameEager = SingletonEager.getInstance();
        System.out.println(sameEager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(lazyHolder);

        SingletonLazyHolder sameLazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(sameLazyHolder);

        //teste Strategy
        Behavior normal = new NormalBehavior();
        Behavior defensive = new DefensiveBehavior();
        Robot robot = new Robot();

        robot.setStrategy(normal);
        robot.move();

        robot.setStrategy(defensive);
        robot.move();

        //teste Facade
        Facade facade = new Facade();
        facade.migrateClient("Ana Heapster", "11060900");
    }
}
