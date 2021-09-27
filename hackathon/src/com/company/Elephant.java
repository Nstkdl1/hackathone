package com.company;

public class Elephant extends Animal {

    private int age;
    private String color;
    private int weight;

    public Elephant() {
        this.animalName = "sabo";
        this.age = 23;
        this.color = "grey";
        this.weight = 155;
    }
    void move () {
        System.out.println("Can go!");
    }

    @Override
    public void eat() {
        // TODO Auto-generated method stub
        System.out.println("Eating gross");
    }
    void displayInfo(){
        System.out.println("About elephant:\t");
        System.out.println("Name:" + animalName + "\nAge: " + age +  "\nColor: " + color + "\nWeight: " + weight);
    }
}
