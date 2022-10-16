package com.example.demo.impl;

public class Rooster extends Chicken {
    @Override
    public boolean sing()
    {
        String sound = "Cock-a-doodle-doo";
        System.out.println("can sing" + sound);
        return true;
    }
}
