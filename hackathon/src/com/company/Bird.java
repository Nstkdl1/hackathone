package com.company;

public class Bird extends Animal {

    private int age;
    private String color;
    private String kind;

    public Bird(){
        this.animalName = "alo";
        this.age = 4;
        this.color = "green";
        this.kind = "parrot";
    }
    void move () {
        System.out.println("Can fly!");
    }

    @Override
    public void eat() {
        // TODO Auto-generated method stub
        System.out.println("Eating crackers");
    }
    void displayInfo(){
        System.out.println("About bird:\t");
        System.out.println("Name:" + animalName + "\nAge: " + age +  "\nColor: " + color + "\nKind: " + kind);
    }
}
