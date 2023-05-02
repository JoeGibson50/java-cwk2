import java.util.Collections;
import java.util.Stack;
import java.util.Random;

// TODO: Implement the Shoe class in this file
public class Shoe {
    
    private Stack<Card> cardDeck;
    public Shoe(int numPacks) throws CardException {
        
        if(numPacks == 6 || numPacks == 8) {
            cardDeck = new Stack<>();
    
            for(int i=0; i < numPacks; i++) {
                for (int j=3; j>=0; j--) {
                    for (int k=12; k>=0; k--) {
                        Card newCard = new BaccaratCard(Card.Rank.values()[k], Card.Suit.values()[j]);
                        cardDeck.add(newCard);
                    }
                }
            }
        }
        else {
            throw new CardException("Incorrect number of decks. Must be 6 or 8.");
        }
    }
    
    public int size() {
        return cardDeck.size();
    }
    
    public Card deal() throws CardException {
        if(!cardDeck.isEmpty()) {
            return cardDeck.pop();
        } else {
            throw new CardException("Deck is empty");
        }
       
    }
    
    public void shuffle() {
        
        // add Card types to deck...
        Collections.shuffle(cardDeck);
    
    }
}