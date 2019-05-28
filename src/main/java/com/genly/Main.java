package com.genly;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap;

public class Main {
    private Characters playerOne;
    private Characters playerTwo;
    private Scanner sc = new Scanner(System.in);

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

        main.startFight(PlayerOne, PlayerTwo);
        do {
            System.out.println(PlayerOne.getType() + " à vous de jouer !");
            System.out.println(" 1 - attaque basique");
            System.out.println(" 2 - attaque spécial");

            main.attack(PlayerOne, PlayerTwo);

            System.out.println(PlayerTwo.getType() + " à vous de jouer !");
            System.out.println(" 1 - attaque basique");
            System.out.println(" 2 - attaque spécial");
            main.attack(PlayerTwo, PlayerOne);
        } while (PlayerOne.getLife() > 0 && PlayerTwo.getLife() > 0);
        if(PlayerOne.getLife() <= 0) {
            System.out.println(PlayerOne.getType() + " est mort !");
            System.out.println("Bravo " + PlayerTwo.getType() + " ! Vous avez gagné !");
        } else {
            System.out.println(PlayerTwo.getType() + " est mort !");
            System.out.println("Bravo " + PlayerOne.getType() + " ! Vous avez gagné !");
        }
    }

    public void addNewPlayer(Characters characters) {
        if(playerOne == null)
            setPlayerOne(characters);
        else
            setPlayerTwo(characters);
    }

    public void startFight(Characters playerOne, Characters playerTwo) {
        if(playerOne.getLife() > 0 && playerTwo.getLife() > 0) {
            System.out.println("Que le combat commence !");
        } else
            System.out.println("Erreur dans le jeu !");
    }

    public void attack(Characters playerOne, Characters playerTwo) {
        int nb = sc.nextInt();
        if (nb == 1 ) {
            playerOne.basicAttack(playerTwo);
        } else if ( nb == 2 ) {
            if (playerOne.getType() == "Guerrier") {
                playerOne.specialAttack(playerTwo);
            } else
                playerOne.specialAttack(playerOne);
        }
    }
}
