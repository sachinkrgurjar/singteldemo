package com.example.demo.impl;

public class ButterFly extends Bird {

    @Override public boolean sing(){
        boolean canSing = false;
        System.out.println("A butterfly can not talk or sing");
        return canSing;
    }
}
