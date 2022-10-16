package com.example.demo.impl;

public class CountingAnimals {
   private  static Animal[] animals = new Animal[]{
            new Bird(),
            new ButterFly(),
            new Caterpiller(),
            new Chicken(),
            new Dolphin(),
            new Duck(),
            new Fish("Small", "orange", "insect", "jolly"),
            new Parrot("meow", "near cat"),
            new Rooster()

    };

   public void checkAnimalProps(){
       int canFlyCount = 0;
       int canWalkCount = 0;
       int canSingCount = 0;
       int canSwimCount = 0;

       for(Animal a : animals)
       {
           if((a instanceof Bird) || (a instanceof Caterpiller) || (a instanceof Duck) | (a instanceof Parrot)|| (a instanceof Rooster) || (a instanceof Chicken))
           {
               canWalkCount++;

           }
           if((a instanceof Bird) || (a instanceof ButterFly) || (a instanceof Duck) | (a instanceof Parrot))
           {
               canFlyCount++;

           }
           if((a instanceof Bird) || (a instanceof Duck) | (a instanceof Parrot))
           {
               canSingCount++;

           }
           if((a instanceof Dolphin) || (a instanceof Fish) | (a instanceof Duck))
           {
               canSwimCount++;

           }


       }
       System.out.println("fly count is: "+ canFlyCount);
       System.out.println("Walk count is:" + canWalkCount);
       System.out.println("Sing count is: " + canSingCount);
       System.out.println("Swim count is:" + canSwimCount);
   }
}
