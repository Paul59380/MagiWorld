package com.genly;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MagusTest {
    @Test
    public void Given_DamageOfCharacters_When_HitTheCharactersWithFireBallAttack_Then_ThisLife () {
        Warrior warrior = new Warrior(6,10,10,3,1, "Warrior");
        Magus magus = new Magus(5,7,2,6,9, "Mage");
        assertEquals(1, magus.basicAttack(warrior), 0.01);
    }
    @Test void Given_BonusOfMagus_When_UseTheSpecialAttackCareInFrontOfEnemy_Then_ThisLifeAndThisIntelligence() {
        Warrior warrior = new Warrior(10,10,10,10,10, "Warrior");
        Magus magus = new Magus(10,10,10,10,10, "Mage");
        assertEquals(30, magus.specialAttack(warrior), 0.01);
    }
}