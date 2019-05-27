package com.genly;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        for (int i = 0; i != 2; i++) {
            System.out.println("Création du personnage " + (i + 1) + " :");
            Order order = new Order();
            ArrayList<String> characters = new ArrayList<String>(order.runChoiceCharacter());
            if ("Guerrier".equals(characters.get(5))) {
                Warrior warrior = new Warrior(Integer.parseInt(characters.get(0)),
                        Integer.parseInt(characters.get(1)),
                        Integer.parseInt(characters.get(2)),
                        Integer.parseInt(characters.get(3)),
                        Integer.parseInt(characters.get(4)),
                        characters.get(5));
                warrior.description();
            } else if ("Rôdeur".equals(characters.get(5))) {
                Walker walker = new Walker(Integer.parseInt(characters.get(0)),
                        Integer.parseInt(characters.get(1)),
                        Integer.parseInt(characters.get(2)),
                        Integer.parseInt(characters.get(3)),
                        Integer.parseInt(characters.get(4)),
                        characters.get(5));
                walker.description();
            } else {
                Magus magus = new Magus(Integer.parseInt(characters.get(0)),
                        Integer.parseInt(characters.get(1)),
                        Integer.parseInt(characters.get(2)),
                        Integer.parseInt(characters.get(3)),
                        Integer.parseInt(characters.get(4)),
                        characters.get(5));
                magus.description();
            }
        }
    }
}
