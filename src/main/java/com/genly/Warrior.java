package com.genly;

public class Warrior extends Characters {

    public Warrior(int level, int life, int strength, int agility, int intelligence, String type) {
        super(level, life, strength, agility, intelligence, type);
    }

    public int basicAttack(Characters characters) {
        System.out.println( this.getType() + " : inflige " + this.getStrength() + " à " + characters.getType());
        int newLife = characters.getLife() - this.getStrength();
        characters.setLife(newLife);
        return characters.getLife();
    }

    public int specialAttack(Characters characters) {
        System.out.println("Je suis un "+ this.getType() + " et j'inflige " + this.getStrength() * 2 + " à " + characters.getType());
        int newLife = characters.getLife() - ( this.getStrength() * 2 );
        int decreaseStrength = this.getStrength() / 2;
        this.setStrength(decreaseStrength);
        System.out.println("Ma force est maintenant de " + this.getStrength() + " pts.");
        characters.setLife(newLife);
        return characters.getLife();
    }

    public void description() {
        if (this.getLife() >= 1)
        System.out.println("Je suis un " + this.getType() + " j'ai un niveau de " + this.getLevel() + ", une vie de "
                + this.getLife() + ", une force de " + this.getStrength() + ", une agilité de " + this.getAgility() + " et " +
                "une intelligence de " + this.getIntelligence());
        else
            System.out.println("Le personnage : " + this.getType() + " est mort !");
    }
}
