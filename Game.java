//eboooo
package blackjack;
import java.util.Random;
import java.util.Scanner;
public class Game { 
   public Player player[]= new Player [4];
    public Card thecards[]=new Card[52];
    public int highscore[]=new int[4];
    public void generetion(){
      int value;
      int c =0;
      for(int suit=0;suit<4;suit++){ // because there are 4 suits
          for(int rank=0;rank<13;rank++) { // because there are 13 ranks
         if (rank>=10)
              value =10;
          else
             value=rank+1;   
        Card card=new Card(suit,rank,value);
        thecards[c]=card;
         c++;
    }
    }
    }   
    public Card draw(){
        Card card=null;
       Random rand=new Random();
         while(card==null){
                 int random=rand.nextInt(51);
                  card=thecards[random];
                  thecards[random]=null;
       }
            return card;
    }
     public void setinformation(){
            Scanner input=new Scanner(System.in);
            for(int i=0;i<player.length-1;i++){
                System.out.println("ENTER THE NAME OF THE PLAYER NUMBER : " + + (i+1));
         player[i]=new Player();
         player[i].Name=input.next();
         player[i].addcard(this.draw());
         player[i].addcard(this.draw());
//         giving each player 2 cards in the begining of the game
            }
       player[3]=new Player();
         player[3].Name="dealer";
         player[3].addcard(this.draw());
         player[3].addcard(this.draw());
         //         giving the dealer 2 cards in the begining of the game
}
     public void updatescore()
     {
         for(int i=0;i<highscore.length;i++)
             highscore[i]=player[i].score<= 21 ? player[i].score:0;
     }
}