public class BaccaratCard extends Card {
    
    public BaccaratCard(Card.Rank rank, Card.Suit suit) {
        super(rank, suit);
    }
    
    /**
     * Computes the value of this card for BaccaratCard.
     *
     * <p>Utilise value from superclass and return 0 if equal to 10.</p>
     *
     * @return Card value
     */
    @Override
    public int value() {
         int cardValue = super.value();
         return cardValue == 10 ? 0 : cardValue;
    }
}