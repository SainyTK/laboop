/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab5;

enum Rank {
    TWO,
    THREE,
    FOUR, 
    FIVE, 
    SIX, 
    SEVEN, 
    EIGHT, 
    NINE, 
    TEN, 
    JACK,
    QUEEN, 
    KING, 
    ACE
}

enum Suit {
    DIAMONDS, 
    CLUBS, 
    HEARTS, 
    SPADES
}

/**
 *
 * @author tk
 */
public class Card {
    
    private Rank rank;
    private Suit suit;
    
    public Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }
    
    public boolean isHighCard() {
        if (rank == Rank.JACK || rank == Rank.KING || rank == Rank.QUEEN || rank == Rank.ACE)
           return true;
        else
            return false;
    }
    
    public boolean isSuite(Suit suit) {
        if (this.suit == suit)
            return true;
        else
            return false;
    }
    
    public void print() {
        System.out.println(suit + "" + rank);
    }
    
    
    
}
