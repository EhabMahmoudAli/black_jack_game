package blackjack;
public class Card {
private final int suit;
private final int rank;
private final int value;
    public Card(int suit, int rank, int value) {
        this.suit = suit;
        this.rank = rank;
        this.value = value;
    }
   public Card (Card c){
      this.suit=c.suit;
       this.rank=c.rank;
       this.value=c.value;
   }
   public int getSuit(){
       return this.suit;
   }
    public int getValue(){
       return this.value;
   }
public int getRank(){
       return this.rank;
   }
}