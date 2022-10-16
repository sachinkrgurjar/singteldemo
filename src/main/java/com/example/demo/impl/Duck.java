package com.example.demo.impl;

public class Duck extends Bird {

    @Override
    public boolean fly(){
        System.out.println("Can not fly");
        return false;
    }

    @Override
    public boolean sing()
    {
        String sound = "quack quack";
        System.out.println("can sing" + sound);
        return true;
    }

    @Override
    public void walk() {
        System.out.println("duck can walk");
    }

    public boolean swim()
    {
        System.out.println("A duck can swim");
        return true;
    }
}
