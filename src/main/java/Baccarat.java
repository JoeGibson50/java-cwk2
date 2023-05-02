public class Baccarat {
    
    public static void main (String[] args){
        
        //Create new shoe with 6 decks
        Shoe shoe = new Shoe(6);
        
        //Shuffle shoe
        shoe.shuffle();
        
        //Create player and bankers hand
        BaccaratHand playerHand = new BaccaratHand();
        BaccaratHand bankerHand = new BaccaratHand();
        
        //Deal card to each player
        for(int i=0; i<2; i++){
            playerHand.add(shoe.deal());
            bankerHand.add(shoe.deal());
        }
        
        System.out.printf("Player: %s = %d\n", playerHand, playerHand.value());
        System.out.printf("Banker: %s = %d\n", bankerHand, bankerHand.value());
        
        if(playerHand.isNatural()) {
            System.out.println("Player has a natural");
        }
    
        if(bankerHand.isNatural()) {
            System.out.println("Banker has a natural");
        }
        
    
    }

    
    
}
