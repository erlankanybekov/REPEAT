package com.company;
import java.awt.*;
import java.util.Arrays;
public final class Dog extends Pet{
    private String name;
    private String breed;
    private String[] commands;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String[] getCommands() {
        return commands;
    }

    public void setCommands(String[] commands) {
        this.commands = commands;
    }

    public Dog(String name, String breed, String[] commands,C4 c4) {
        this.name = name;
        this.breed = breed;
        this.commands = commands;
        super.setColor(c4);
    }
    public Dog(String name, String breed, String[] commands,Shelter shelter ,C4 c4) {
        this.name = name;
        this.breed = breed;
        this.commands = commands;
        super.setColor(c4);
        super.setShelter(shelter);

    }
    public void makeVoice(String voice, int number){
        for (int i = 0; i < number; i++) {
            System.out.println(voice);
        }
    }

    @Override
    public String getInfo() {
        return super.getInfo() +
                "\nName: " + name +
                "\nBreed: " + breed +
                "\nCommands: " + Arrays.toString(commands);
    }
}

