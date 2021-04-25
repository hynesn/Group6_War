/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;
import java.util.*;

/**
 *
 * @author Emma's Place
 */
public class WarGame extends Game{

    public WarGame(String name) {
        super(name);
    }
    public static void main(String[]args){       
        
        
        Scanner input = new Scanner(System.in);       
        
                
        GroupOfCards fullDeck = new GroupOfCards(52); 
        
        GroupOfCards player1Deck = new GroupOfCards(52); 
        
        GroupOfCards player2Deck = new GroupOfCards(52); 
        
        WarPlayer p1 = new WarPlayer("Player1");
        
        WarPlayer p2 = new WarPlayer("Player2");
        
        System.out.println("Player 1 please enter a name");
        p1.setName(input.nextLine()); 
      
        System.out.println("Player 2 please enter a name");
        p2.setName(input.nextLine()); 
        
    
        
        
        
        
        
    }//ends main method

    @Override
    public void play() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void declareWinner() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}//ends class
