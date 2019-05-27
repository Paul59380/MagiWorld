package com.genly;

public class Magus extends Characters {
    public Magus(int level, int life, int strength, int agility, int intelligence, String type) {
        super(level, life, strength, agility, intelligence, type);
    }

    public int basicAttack(Characters characters) {
        System.out.println( this.getType() + " j'inflige " + this.getIntelligence() + " de dégâts à " + characters.getType());
        int newLife = characters.getLife() - this.getIntelligence();
        characters.setLife(newLife);
        return characters.getLife();
    }

    public int specialAttack(Characters characters) {
        System.out.println( this.getType() + " : Restaure sa vie de  " + this.getLife() + " points et sont " +
                "intelligence de " + this.getLife() * 2);
        int newLife = 10;
        this.setLife(newLife);
        int newIntelligence = this.getLife() * 2;
        this.setIntelligence(newIntelligence);
        return this.getLife() + this.getIntelligence();
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
