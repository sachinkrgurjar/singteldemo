package com.example.demo.impl;

public class Dolphin implements Animal{
    @Override
    public void walk(){}
    @Override
    public boolean swim()
    {
        boolean canSwim = true;
        System.out.println("Dolphin can swim");
        return canSwim;
    }
}
