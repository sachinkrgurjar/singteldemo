package com.example.demo.impl;

public class Chicken extends Bird {

    @Override
    public boolean fly(){
        System.out.println("Can not fly");
        return false;
    }

    @Override
    public boolean sing()
    {
        String sound = "cluck cluck";
        System.out.println("can sing" + sound);
        return true;
    }

    @Override
    public void walk() {
        System.out.println("chicken can walk");
    }


}
