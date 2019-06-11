package collections_method_shuffle;

import java.util.Arrays;
import java.util.Collections;

// Class for represent one deck a card
class Card {
    
    public static enum Face {Ace, Deuce, Three, Four, Five, Six, Seven, Eight,
       Nine, Ten, Jack, Queen, King};
    public static enum Suit {Clubs, Diamonds, Hearts, Spades};
    
    private final Face face;
    private final Suit suit;
    
    // Constructor
    public Card(Face face, Suit suit) {
        
        this.face = face;
        this.suit = suit;
    }
    
    // getting and return face of card 
    public Face getFace() {
        
        return face;
    }
    
    // getting and return suit of card
    public Suit getSuit() {
        
        return suit;
    }
    
    @Override
    public String toString() {
        
        return String.format("%s of %s", face, suit);
    }
} // End of class Card

// Collection interface with method shuffle(deck of cards)
public class Collections_method_Shuffle {
    
    private java.util.List<Card> list; // declares List which will store Cards
    
    public Collections_method_Shuffle() {
        
        Card[] deck = new Card[52];
        int quantities = 0; // cards number
        
        // fills deck of cards with objects Card
        for(Card.Suit suit: Card.Suit.values()) {
            
            for (Card.Face face: Card.Face.values()) {
                
                deck[quantities] = new Card(face, suit);
                ++quantities;
            }
        }
        
        list = Arrays.asList(deck); // getting List
        Collections.shuffle(list); // Shuffle to cards
    } // End of constructor Collections_method_Shuffle
    
    // output generates deck of cards
    public void printCards() {
        
        // display 52 cards in two columns
        for (int x = 0; x < list.size(); x++) 
            System.out.printf("%-19s%s", list.get(x),
                    ((x + 1) % 4 == 0) ? "\n" : "");
    }
    
    public static void main(String[] args) {
        
        Collections_method_Shuffle decks = new Collections_method_Shuffle();
        decks.printCards();
        
    }
} // End of class Collections_method_Shuffle