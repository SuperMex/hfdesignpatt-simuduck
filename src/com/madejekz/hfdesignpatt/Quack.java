package com.madejekz.hfdesignpatt;

/**
 * Created by madejekz on 7/22/2018.
 */
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
