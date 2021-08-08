package com.company;

public class Main {

    public static void main(String[] args) {
        Dog North = new Dog("North", "Бродяга", new String[]{"Sit", "lie"},C4.WHITE);
        System.out.println(North.getInfo());
        North.makeVoice("GAF", 3);
        System.out.println("____________________________________");
        Shelter Sun = new Shelter("Солнце для животных", "ул.Советская 34");
        Dog Rex = new Dog("Rex", "Овчарка", new String[]{"Run", "Bite"}, Sun, C4.GRAY);
        System.out.println(Rex.getInfo());
        Rex.makeVoice("GAF",2);
    }

}