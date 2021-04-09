package ca.sheridancollege.project;

/**
 *
 * @author Emma's Place
 */
public enum CardValue{
    
    TWO("Two", 2),
    THREE("Three", 3),
    FOUR("Four", 4),
    FIVE("Five", 5),
    SIX("Six", 6),
    SEVEN("Seven", 7),
    EIGHT("Eight", 8),
    NINE("Nine", 9),
    TEN("Ten", 10),
    JACK("Eleven", 11),
    QUEEN("Twelve", 12),
    KING("Thirteen", 13),
    ACE("Ace", 14);
     
    private String value;
    private int number;

    private CardValue(String value, int number) {
        this.value = value;
        this.number = number;
    }

    public String getValue() {
        return value;
    }

    public int getNumber() {
        return number;
    }
    
}
