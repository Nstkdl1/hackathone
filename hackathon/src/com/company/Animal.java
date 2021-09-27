package com.company;

public abstract class Animal {
    public String animalName;
    public String getAnimalName() { return animalName; }

    void move() {
        System.out.println ("Can move");
    }
    public abstract void eat();
}


