package com.genly;

import java.util.ArrayList;

public class Main {
    private Characters playerOne;
    private Characters playerTwo;

    public void setPlayerOne(Characters playerOne) {
        this.playerOne = playerOne;
    }

    public void setPlayerTwo(Characters playerTwo) {
        this.playerTwo = playerTwo;
    }

    public static void main(String[] args) {
        Main main = new Main();
        for (int i = 0; i != 2; i++) {
            System.out.println("Création du personnage " + (i + 1) + " :");
            Order order = new Order();
            ArrayList<String> characters = new ArrayList<String>(order.runChoiceCharacter());
            if ("Guerrier".equals(characters.get(5))) {
                Characters warrior = new Warrior(Integer.parseInt(characters.get(0)),
                        Integer.parseInt(characters.get(1)),
                        Integer.parseInt(characters.get(2)),
                        Integer.parseInt(characters.get(3)),
                        Integer.parseInt(characters.get(4)),
                        characters.get(5));
                main.addNewPlayer(warrior);
            } else if ("Rôdeur".equals(characters.get(5))) {
                Characters walker = new Walker(Integer.parseInt(characters.get(0)),
                        Integer.parseInt(characters.get(1)),
                        Integer.parseInt(characters.get(2)),
                        Integer.parseInt(characters.get(3)),
                        Integer.parseInt(characters.get(4)),
                        characters.get(5));
                main.addNewPlayer(walker);
            } else {
                Characters magus = new Magus(Integer.parseInt(characters.get(0)),
                        Integer.parseInt(characters.get(1)),
                        Integer.parseInt(characters.get(2)),
                        Integer.parseInt(characters.get(3)),
                        Integer.parseInt(characters.get(4)),
                        characters.get(5));
                main.addNewPlayer(magus);
            }
        }
        Characters PlayerOne = main.playerOne;
        Characters PlayerTwo = main.playerTwo;

        PlayerOne.description();
        PlayerTwo.description();
    }

    public void addNewPlayer(Characters characters) {
        if(playerOne == null)
            setPlayerOne(characters);
        else
            setPlayerTwo(characters);
    }
}
