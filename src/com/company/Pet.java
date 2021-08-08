package com.company;

import java.util.Random;

public class Pet {
    private int age = generateDefaultAge();
    private C4 color;
    private Shelter shelter;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public C4 getColor() {
        return color;
    }

    public void setColor(C4 color) {
        this.color = color;
    }

    public Shelter getShelter() {
        return shelter;
    }

    public void setShelter(Shelter shelter) {
        this.shelter = shelter;
    }

    private int generateDefaultAge() {
        Random random = new Random();
        return random.nextInt(10) + 1;
    }

    public String getInfo() {
        if (shelter != null) {
            return "Age : "+ age +
                    "\nColor: "+ color +
                    "\nShelter Name: "+ shelter.getName()+
                    "\nShelter address "+ shelter.getAddress();

        }
        else {
            return "Age : "+ age +
                    "\nColor: "+ color;
        }
    }
}

