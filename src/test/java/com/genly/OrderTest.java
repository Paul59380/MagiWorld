package com.genly;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class OrderTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }
    @AfterEach
    public void restoreStreams() {
        System.setOut(System.out);
    }

    Order order = new Order();

    @Test
    void Given_Warrior_When_displayCharactersSelected_Then_DisplayWarriorSentence() {
        order.displaySelectedChoice(1);
        assertEquals("Vous avez choisi la classe Guerrier !\n", outContent.toString().replace("\r\n", "\n"));
    }
    @Test
    void Given_Walker_When_displayCharactersSelected_Then_DisplayWalkerSentence() {
        order.displaySelectedChoice(2);
        assertEquals("Vous avez choisi la classe Rôdeur !\n", outContent.toString().replace("\r\n", "\n"));
    }
    @Test
    void Given_Magus_When_displayCharactersSelected_Then_DisplayMagusSentence() {
        order.displaySelectedChoice(3);
        assertEquals("Vous avez choisi la classe Mage !\n", outContent.toString().replace("\r\n", "\n"));
    }
    @Test
    void Given_Another_When_displayCharactersSelected_Then_DisplayAnotherSentence() {
        order.displaySelectedChoice(8);
        assertEquals("Vous n'avez pas choisi parmis les choix proposé !\n", outContent.toString().replace("\r\n", "\n"));
    }
}