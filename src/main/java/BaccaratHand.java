public class BaccaratHand extends CardCollection {
    
    public boolean isNatural() {
        return (value() == 8 || value() == 9) && size() == 2;
    }
    
    public int value() {
        int handValue = super.value();
        if(handValue >= 10)
        {
            handValue = handValue - 10;
        }
        return handValue ;
    }
    
    public String toString() {
        String handString = "";
        for (Card card: cards) {
            handString += card.toString() + " ";
        }
        return handString.trim();
    }
}

