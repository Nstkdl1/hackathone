package com.company;

public class Hackathon {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.displayInfo();
        dog.eat();
        dog.move();

        Cat cat = new Cat();
        cat.displayInfo();
        cat.eat();
        cat.move();

        Bird bird = new Bird();
        bird.displayInfo();
        bird.eat();
        bird.move();


        Elephant elephant = new Elephant();
        elephant.displayInfo();
        elephant.eat();
        elephant.move();
    }
}
