/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab5;

/**
 *
 * @author tk
 */
public class EnumTest {
    
    public static void main(String args[]) {
        Card card = new Card(Rank.ACE, Suit.HEARTS);
        Card card2 = new Card(Rank.FOUR, Suit.CLUBS);
        
        card.print();
        card2.print();
        
        System.out.println("isHighCard: " + card.isHighCard());
        System.out.println("isHighCard: " + card2.isHighCard());
        
        System.out.println("isSuite: " + card.isSuite(Suit.CLUBS));
        System.out.println("isSuite: " + card2.isSuite(Suit.CLUBS));
        
    }
    
}
