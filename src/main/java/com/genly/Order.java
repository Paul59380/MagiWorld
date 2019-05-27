package com.genly;

import java.util.Scanner;

public class Order {
    Scanner sc = new Scanner(System.in);

    public void displayAvailableChoice() {
        System.out.println("Création du personnage 1 :");
        System.out.println("Veuillez choisir la classe de votre personnage : ");
        System.out.println("1 - Guerrier");
        System.out.println("2 - Rôdeur");
        System.out.println("3 - Mage");
    }

    public void displaySelectedChoice(int nbClassCharacters) {
        switch (nbClassCharacters) {
            case 1 :
                System.out.println("Vous avez choisi la classe Guerrier !");
                System.out.println("Niveau du personnage ?");
                int level = this.seizeTheAttributes();
                System.out.println("Force du personnage ?");
                int strength = this.seizeTheAttributes();
                System.out.println("Santé du personnage ?");
                int life = this.seizeTheAttributes();
                System.out.println("Agilité du personnage ?");
                int agility = this.seizeTheAttributes();
                System.out.println("Intelligence du personnage ?");
                int intelligence = this.seizeTheAttributes();
                String type = "Guerrier";
                Warrior warrior = new Warrior(level, life, strength, agility, intelligence, type);
                warrior.description();
                break;
            case 2 :
                System.out.println("Vous avez choisi la classe Rôdeur !");
                System.out.println("Niveau du personnage ?");
                level = this.seizeTheAttributes();
                System.out.println("Force du personnage ?");
                strength = this.seizeTheAttributes();
                System.out.println("Santé du personnage ?");
                life = this.seizeTheAttributes();
                System.out.println("Agilité du personnage ?");
                agility = this.seizeTheAttributes();
                System.out.println("Intelligence du personnage ?");
                intelligence = this.seizeTheAttributes();
                type = "Rôdeur";
                Walker walker = new Walker(level, life, strength, agility, intelligence, type);
                walker.description();
                break;
            case 3 :
                System.out.println("Vous avez choisi la classe Mage !");
                System.out.println("Niveau du personnage ?");
                level = this.seizeTheAttributes();
                System.out.println("Force du personnage ?");
                strength = this.seizeTheAttributes();
                System.out.println("Santé du personnage ?");
                life = this.seizeTheAttributes();
                System.out.println("Agilité du personnage ?");
                agility = this.seizeTheAttributes();
                System.out.println("Intelligence du personnage ?");
                intelligence = this.seizeTheAttributes();
                type = "Mage";
                Magus magus = new Magus(level, life, strength, agility, intelligence, type);
                magus.description();
                break;
            default :
                System.out.println("Vous n'avez pas choisi parmis les choix proposé !");
                break;
        }
    }

    public void runChoiceCharacters() {
        this.displayAvailableChoice();
        int nb = sc.nextInt();
        this.displaySelectedChoice(nb);
    }

    public int seizeTheAttributes() {
        int nb = sc.nextInt();
        return defineTheAttributes(nb);
    }

    private int defineTheAttributes(int nb) {
        System.out.println("Son niveau est de " + nb);
        return nb;
    }
}
