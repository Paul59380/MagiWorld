package com.genly;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WarriorTest {
    @Test
    public void Given_DamageOfPersonnage_When_HitThePersonnageWithBasicAttack_Then_ThisLife() {
        Warrior warrior = new Warrior(10,15,10,20,3, "Warrior");
        Magus magus = new Magus(8,65,5,30,66, "Mage");
        assertEquals(55, warrior.basicAttack(magus), 0.01);
    }
    @Test void Given_DamageOfPersonnage_When_HitThePersonnageWithSpecialAttack_Then_ThisLife() {
        Warrior warrior = new Warrior(10,15,10,20,3, "Warrior");
        Magus magus = new Magus(8,65,5,30,66, "Mage");
        assertEquals(45, warrior.specialAttack(magus), 0.01);
    }
}