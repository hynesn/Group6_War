
package ca.sheridancollege.project;

import java.util.ArrayList;

/**
 *
 * @author Emma's Place
 */
public class WarPlayer extends Player{
    
    private ArrayList<WarCard> playerCardList;

    public ArrayList<WarCard> getPlayerCardList() {
        return playerCardList;
    }

    public void setPlayerCardList(ArrayList<WarCard> playerCardList) {
        this.playerCardList = playerCardList;
    }

    public WarPlayer(ArrayList<WarCard> playerCardList, String name) {
        super(name);
        this.playerCardList = playerCardList;
    }

    @Override
    public void play() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
  
  
    
}
