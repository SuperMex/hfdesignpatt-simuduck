package com.madejekz.hfdesignpatt;

/**
 * Created by madejekz on 7/22/2018.
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
