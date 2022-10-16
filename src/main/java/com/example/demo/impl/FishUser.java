package com.example.demo.impl;

public class FishUser {
    //1. shark
    Fish shark = new Fish("large", "grey", "other fish", "angry");
    //2. clownfish
    Fish clownFish = new Fish("small", "orange", "insects", "jolly");

    public void displayFishProps() {
        System.out.println("Shark size :" + shark.getSize() + "shark color" + shark.getColor() + "food:" + shark.getFood() + "nature"+ shark.getNature() );
        System.out.println("clownFish size :" + clownFish.getSize() + "clownFish color" + clownFish.getColor() + "food:" + clownFish.getFood() + "nature"+ clownFish.getNature() );

    }
}
