/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Emma's Place
 */
public class CardSuitTest {
    
    public CardSuitTest() {
    }
    
    @BeforeEach
    public void setUp() {
    }

    /**
     * Test of values method, of class CardSuit.
     */
    @Test
    public void testValues() {
        System.out.println("values");
        CardSuit[] expResult = null;
        CardSuit[] result = CardSuit.values();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of valueOf method, of class CardSuit.
     */
    @Test
    public void testValueOf() {
        System.out.println("valueOf");
        String string = "";
        CardSuit expResult = null;
        CardSuit result = CardSuit.valueOf(string);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAltName method, of class CardSuit.
     */
    @Test
    public void testGetAltName() {
        System.out.println("getAltName");
        CardSuit instance = null;
        String expResult = "";
        String result = instance.getAltName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSuitSymbol method, of class CardSuit.
     */
    @Test
    public void testGetSuitSymbol() {
        System.out.println("getSuitSymbol");
        CardSuit instance = null;
        String expResult = "";
        String result = instance.getSuitSymbol();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
