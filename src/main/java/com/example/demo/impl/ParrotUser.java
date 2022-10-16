package com.example.demo.impl;


public class ParrotUser {
    //1. A parrot living with dogs says: “Woof, woof”
    Parrot parrot1 = new Parrot("woof woof", "near dog");
    //2. A parrot living with cats says: “ Me ow”
    Parrot parrot2 = new Parrot("me ow", "near cat");
    //3. A parrot living near the rooster says: “ Cock-a-doodle-doo ”
    Parrot parrot3 = new Parrot("me ow", "near rooster");

    public void displayParrotProps() {
        System.out.println("parrot1 sound :" + parrot1.getSound() + "parrot1 loc :" + parrot1.getLoc());
        System.out.println("parrot2 sound :" + parrot2.getSound() + "parrot2 loc :" + parrot2.getLoc());
        System.out.println("parrot3 sound :" + parrot3.getSound() + "parrot3 loc :" + parrot3.getLoc());
    }
}
