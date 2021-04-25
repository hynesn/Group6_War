
package ca.sheridancollege.project;

import java.util.ArrayList;

/**
 *
 * @author Emma's Place
 */
public class WarPlayer extends Player{
    
    private GroupOfCards playerCardList;

    public GroupOfCards getPlayerCardList() {
        return playerCardList;
    }

    public void setPlayerCardList(GroupOfCards playerCardList) {
        this.playerCardList = playerCardList;
    }

    public WarPlayer(GroupOfCards playerCardList, String name) {
        super(name);
        this.playerCardList = playerCardList;
    }

    @Override
    public void play() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
  
  
    
}
