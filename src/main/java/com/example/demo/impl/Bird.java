package com.example.demo.impl;

import com.example.demo.impl.Animal;

public class Bird implements Animal {
    public boolean fly(){
        boolean canFly= true;
        System.out.println("cabn fly");
        return canFly;
    };
    public boolean swim(){
        boolean canSwim= true;
        System.out.println("can swim");
        return canSwim;
    };

    public boolean sing(){
        boolean canSing= true;
        System.out.println("can sing");
        return canSing;
    };

    @Override
    public void walk() {
        System.out.println("can walk");
    }
}
