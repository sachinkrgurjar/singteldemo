package com.example.demo.impl;


public class Parrot extends Bird{
    private String sound;
    private String loc;

    public String getSound() {
        return sound;
    }

    public Parrot(String sound, String loc) {
        this.sound = sound;
        this.loc = loc;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }


    public void setLoc(String loc) {
        this.sound = loc;
    }

    public String getLoc() {
        return loc;
    }

    public boolean sing(String sound)
    {
        boolean canSing= true;
        System.out.println("can sing: " + sound);
        return canSing;
    }

    public String  locality(String loc)
    {
        System.out.println("lives near " + loc);
        return loc;
    }

}
