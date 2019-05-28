package com.genly;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WalkerTest {
    @Test
    public void Given_DamageInflictedAtCharactersOpponent_When_WalkerHitHisOpponent_Then_LifeOfOpponent() {
        Magus magus = new Magus(10,10,10,10,10, "Mage");
        Walker walker = new Walker(8,8,8,8,8,"Rôdeur");
        assertEquals(2, walker.basicAttack(magus), 0.01);
    }
    @Test
    public void Given_BonusSpecialAttack_When_WalkerUseHisSpecialAttack_Then_HisNewLevel() {
        Walker walker = new Walker(6,6,6,8,6,"Rôdeur");
        assertEquals(10, walker.specialAttack(walker), 0.01);
    }
}
