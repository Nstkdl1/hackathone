package com.company;

public class Dog extends Animal{

    private int age;
    private String color;
    private String family;

    public Dog (){
        this.animalName = "dleff";
        this.age = 12;
        this.color = "black";
        this.family = "labrador";
    }
    void move () {
        System.out.println("Can run");
    }
    @Override
    public void eat() {
        // TODO Auto-generated method stub
        System.out.println("Eating meat");
    }
    void displayInfo(){
        System.out.println("About dog:");
        System.out.println("Name:" + animalName + " \nAge: " + age +  "\nColor: " + color + "\nFamily:" + family);
    }

}
