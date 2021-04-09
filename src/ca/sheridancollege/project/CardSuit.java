package ca.sheridancollege.project;

/**
 *
 * @author Emma's Place
 */
public enum CardSuit {
    HEARTS("Hearts", "<3"),
    SPADES("Spades", "<3<"),
    CLUBS("Clubs", "o8<"),
    DIAMONDS("Diamonds", "<>");
    
    private String altName;

    public String getAltName() {
        return altName;
    }

    public String getSuitSymbol() {
        return suitSymbol;
    }
    private String suitSymbol;

    private CardSuit(String altName, String suitSymbol) {
        this.altName = altName;
        this.suitSymbol = suitSymbol;
    }
    
    
}
