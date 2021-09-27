package com.company;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.ArrayList;
import java.io.*;
public class Ex7 {
    public static void main(String[] args) {

        String filename = "animal.txt";
        ArrayList<Ex7.Dog> dog = new ArrayList<com.company.Ex7.Dog>();
        dog.add(new Ex7.Dog("Djeff", 12, "black", "labrador"));

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(dog);
            System.out.println("File has been written");
        } catch (Exception ex) {

            System.out.println(ex.getMessage());
        }

        ArrayList<com.company.Ex7.Dog> newDog = new ArrayList<com.company.Ex7.Dog>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {

            newDog = ((ArrayList<com.company.Ex7.Dog>) ois.readObject());
        } catch (Exception ex) {

            System.out.println(ex.getMessage());
        }

        for (com.company.Ex7.Dog d : newDog)
            System.out.printf("Name: %s \t Age: %d \n", d.getName(), d.getAge());
        }
        static class Dog implements Serializable {
        private String name;
        private int age;
        private String color;
        private String family;

            Dog(String n, int a, String c, String f){

                name=n;
                age=a;
                color=c;
                family=f;
            }
            String getName() {return name;}
            int getAge(){ return age;}
            String getColor(){return color;}
            String getFamily(){return family;}
    }
}
