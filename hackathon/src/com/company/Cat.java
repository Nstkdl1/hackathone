package com.company;

public class Cat extends Animal{

    private int age;
    private String color;
    private int length;

    public Cat(){
        this.animalName = "murka";
        this.age = 1;
        this.color = "white";
        this.length = 123;
    }
    void move () {
        System.out.println("Can crawl!");
    }

    @Override
    public void eat() {
        // TODO Auto-generated method stub
        System.out.println("Eating feed");

    }
    void displayInfo(){
        System.out.println("About cat:");
        System.out.println("Name:" + animalName + "\nAge: " + age +  "\nColor: " + color + "\nLength: " + length);
    }
}
