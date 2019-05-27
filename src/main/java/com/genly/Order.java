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
                int level = this.seizeTheLevel();
                int strength = this.seizeTheStrength();
                int life = this.seizeTheLife();
                int agility = this.seizeTheAgility();
                int intelligence = this.seizeTheIntelligence();
                String type = "Guerrier";
                Warrior warrior = new Warrior(level, life, strength, agility, intelligence, type);
                warrior.description();
                break;
            case 2 :
                System.out.println("Vous avez choisi la classe Rôdeur !");
                level = this.seizeTheLevel();
                strength = this.seizeTheStrength();
                life = this.seizeTheLife();
                agility = this.seizeTheAgility();
                intelligence = this.seizeTheIntelligence();
                type = "Rôdeur";
                Walker walker = new Walker(level, life, strength, agility, intelligence, type);
                walker.description();
                break;
            case 3 :
                System.out.println("Vous avez choisi la classe Mage !");
                level = this.seizeTheLevel();
                strength = this.seizeTheStrength();
                life = this.seizeTheLife();
                agility = this.seizeTheAgility();
                intelligence = this.seizeTheIntelligence();
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

    public int seizeTheLevel() {
        System.out.println("Niveau du personnage ?");
        int nb = sc.nextInt();
        return defineThisLevel(nb);
    }

    private int defineThisLevel(int nb) {
        System.out.println("Son niveau est de " + nb);
        return nb;
    }

    public int seizeTheStrength() {
        System.out.println("Force du personnage ?");
        int nb = sc.nextInt();
        return defineThisStrength(nb);
    }

    private int defineThisStrength(int nb) {
        System.out.println("Sa force est de : " + nb);
        return nb;
    }

    public int seizeTheLife() {
        System.out.println("Santé du personnage ?");
        int nb = sc.nextInt();
        return defineThisLife(nb);
    }

    private int defineThisLife(int nb) {
        System.out.println("Sa santé est de : " + nb);
        return nb;
    }

    public int seizeTheAgility() {
        System.out.println("Agilité du personnage ?");
        int nb = sc.nextInt();
        return defineThisAgility(nb);
    }

    private int defineThisAgility(int nb) {
        System.out.println("Son agilité est de : " + nb);
        return nb;
    }

    public int seizeTheIntelligence() {
        System.out.println("Intelligence du personnage ?");
        int nb = sc.nextInt();
        return defineThisIntelligence(nb);
    }

    private int defineThisIntelligence(int nb) {
        System.out.println("Son intelligence est de : " + nb);
        return nb;
    }
}
