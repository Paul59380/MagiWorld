package com.genly;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Order {

    private Scanner sc = new Scanner(System.in);

    /**
     * Display the choice for the characters
     */
    public void displayAvailableChoice() {
        System.out.println("Création du personnage 1 :");
        System.out.println("Veuillez choisir la classe de votre personnage : ");
        System.out.println("1 - Guerrier");
        System.out.println("2 - Rôdeur");
        System.out.println("3 - Mage");
    }

    /**
     * Allows instantiate one class and create a characters
     * @param nbClassCharacters
     */
    public void displaySelectedChoice(int nbClassCharacters) {
            switch (nbClassCharacters) {
                case 1:
                    System.out.println("Vous avez choisi la classe Guerrier !");
                    int[] warriorAttr = makeACharaters();
                    Warrior warrior = new Warrior(warriorAttr[0], warriorAttr[1], warriorAttr[2], warriorAttr[3],
                            warriorAttr[4],
                            "Warrior");
                    warrior.description();
                    break;
                case 2:
                    System.out.println("Vous avez choisi la classe Rôdeur !");
                    int[] walkerAttr = makeACharaters();
                    Walker walker = new Walker(walkerAttr[0], walkerAttr[1], walkerAttr[2], walkerAttr[3], walkerAttr[4],
                            "Rôdeur");
                    walker.description();
                    break;
                case 3:
                    System.out.println("Vous avez choisi la classe Mage !");
                    int[] magusAttr = makeACharaters();
                    Magus magus = new Magus(magusAttr[0], magusAttr[1], magusAttr[2], magusAttr[3], magusAttr[4],
                            "Mage");
                    magus.description();
                    break;
                default:
                    System.out.println("Vous n'avez pas choisi parmis les choix proposé !");
                    break;
            }
    }

    public int[] makeACharaters() {
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
        int valuesAttr[] = {level, strength, life, agility, intelligence};
        return valuesAttr;
    }

    /**
     * Display the menu for create a characters
     * She call displayAvailableChoice and displaySelectedChoice method
     */
    public void runChoiceCharacter() {
            this.displayAvailableChoice();
            int nb = sc.nextInt();
            this.displaySelectedChoice(nb);
    }

    /**
     * Allows of define the parameters of object instantiate by value seize by user
     * @return the value seized by user
     */
    public int seizeTheAttributes() {
        int nb = sc.nextInt();
        return defineTheAttributes(nb);
    }

    /**
     * Affected the value at the attributs of characters
     * @param nb
     * @return
     */
    private int defineTheAttributes(int nb) {
        System.out.println("Son niveau est de " + nb);
        return nb;
    }
}
