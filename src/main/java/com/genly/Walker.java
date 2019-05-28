package com.genly;

public class Walker extends Characters {

    public Walker(int level, int life, int strength, int agility, int intelligence, String type) {
        super(level, life, strength, agility, intelligence, type);
    }

    public int basicAttack(Characters characters) {
        int damages = this.getAgility();
        int newLife = characters.getLife() - damages;
        characters.setLife(newLife);
        System.out.println("Le Rôdeur utilise sont attaque basique et inflige " + damages + " points de dégâts à "
                + characters.getType());
        return characters.getLife();
    }

    public int specialAttack(Characters characters) {
        int addLevel = this.getAgility() / 2;
        int newLevel = this.getLevel() + addLevel;
        setLevel(newLevel);
        System.out.println("Le Rôdeur utilise sont attaque spécial et gagne " + addLevel + " de niveau");
        return getLevel();
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
