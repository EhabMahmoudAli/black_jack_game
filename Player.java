package blackjack;
public class Player {
 public String Name;
  public int score=0;
 @SuppressWarnings("FieldMayBeFinal")
  private Card krot[]=new Card[11];
   private int kcounter =0;
  public void addcard(Card car){
      if (kcounter<11)
          krot[kcounter]= car;
      kcounter++;
      score=score+car.getValue();
  }
  public Card [] getkrot()
  {
      return this .krot;
  }
}
