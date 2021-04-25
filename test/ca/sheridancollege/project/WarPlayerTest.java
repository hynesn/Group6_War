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
public class WarPlayerTest {
    
    public WarPlayerTest() {
    }
    
    @BeforeEach
    public void setUp() {
    }

    /**
     * Test of getPlayerCardList method, of class WarPlayer.
     */
    @Test
    public void testGetPlayerCardList() {
        System.out.println("getPlayerCardList");
        WarPlayer instance = null;
        GroupOfCards expResult = null;
        GroupOfCards result = instance.getPlayerCardList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPlayerCardList method, of class WarPlayer.
     */
    @Test
    public void testSetPlayerCardList() {
        System.out.println("setPlayerCardList");
        GroupOfCards playerCardList = null;
        WarPlayer instance = null;
        instance.setPlayerCardList(playerCardList);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of play method, of class WarPlayer.
     */
    @Test
    public void testPlay() {
        System.out.println("play");
        WarPlayer instance = null;
        instance.play();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
