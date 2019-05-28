package com.genly;

import java.util.ArrayList;
import java.util.Scanner;

public class Order {

    private Scanner sc = new Scanner(System.in);

    /**
     * Display the choice for the characters
     */
    public void displayAvailableChoice() {
        System.out.println("Veuillez choisir la classe de votre personnage : ");
        System.out.println("1 - Guerrier");
        System.out.println("2 - Rôdeur");
        System.out.println("3 - Mage");
    }

    /**
     * Allows instantiate one class and create a characters
     * @param nbClassCharacters
     */
    public ArrayList<String> displaySelectedChoice(int nbClassCharacters) {
            switch (nbClassCharacters) {
                case 1:
                    System.out.println("Vous avez choisi la classe Guerrier !");
                    ArrayList<String> warriorAttr = new ArrayList<String>(makeACharaters());
                    warriorAttr.add("Guerrier");
                    return warriorAttr;
                case 2:
                    System.out.println("Vous avez choisi la classe Rôdeur !");
                    ArrayList<String> walkerAttr = new ArrayList<String>(makeACharaters());
                    walkerAttr.add("Rôdeur");
                    return walkerAttr;
                case 3:
                    System.out.println("Vous avez choisi la classe Mage !");
                    ArrayList<String> magusAttr = new ArrayList<String>(makeACharaters());
                    magusAttr.add("Mage");
                    return magusAttr;
                default:
                    System.out.println("Vous n'avez pas choisi parmis les choix proposé !");
                    return new ArrayList<String>();
            }
    }

    public ArrayList<String> makeACharaters() {
        System.out.println("Niveau du personnage ?");
        int level = this.seizeTheAttributes();
        System.out.println("Santé du personnage ?");
        int life = this.seizeTheAttributes();
        System.out.println("Force du personnage ?");
        int strength = this.seizeTheAttributes();
        System.out.println("Agilité du personnage ?");
        int agility = this.seizeTheAttributes();
        System.out.println("Intelligence du personnage ?");
        int intelligence = this.seizeTheAttributes();
        ArrayList<String> valueAttr = new ArrayList<String>();
        valueAttr.add(String.valueOf(level));
        valueAttr.add(String.valueOf(life));
        valueAttr.add(String.valueOf(strength));
        valueAttr.add(String.valueOf(agility));
        valueAttr.add(String.valueOf(intelligence));
        return valueAttr;
    }

    /**
     * Display the menu for create a characters
     * She call displayAvailableChoice and displaySelectedChoice method
     */
    public ArrayList<String> runChoiceCharacter() {
        this.displayAvailableChoice();
        int nb = sc.nextInt();
        ArrayList<String> charactersAttr = new ArrayList<String>(this.displaySelectedChoice(nb));
        return charactersAttr;
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
        return nb;
    }
}
