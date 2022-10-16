package com.example.demo.impl;

import com.example.demo.impl.Animal;

public class Fish implements Animal {

    private String size;
    private String color;
    private String food;
    private String nature;
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getNature() {
        return nature;
    }

    public void setNature(String nature) {
        this.nature = nature;
    }

    public boolean sing(){
        boolean canSing= false;
        System.out.println("can not sing");
        return canSing;
    };

    public Fish(String size, String color, String food, String nature) {
        this.size = size;
        this.color = color;
        this.food = food;
        this.nature = nature;
    }

    public boolean swim(){
        boolean canSing= true;
        System.out.println("can swim");
        return canSing;
    };

    @Override
    public void walk() {
        System.out.println("can not walk");
    }
}
