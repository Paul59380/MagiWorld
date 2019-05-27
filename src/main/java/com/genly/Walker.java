package com.genly;

public class Walker extends Characters {

    public Walker(int level, int life, int strength, int agility, int intelligence, String type) {
        super(level, life, strength, agility, intelligence, type);
    }

    public int basicAttack(Characters characters) {
        return 0;
    }

    public int specialAttack(Characters characters) {
        return 0;
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
