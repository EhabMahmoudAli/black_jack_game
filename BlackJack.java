//THIS IS MY OWN CODE
//FROM EHAB MAHMOUD
package blackjack;
import java.util.Scanner;
public class BlackJack {
    static Game game=new Game();
    public static void main(String[] args) {
       GUI gui = new GUI();
       game.generetion();
//       call function generate
       game.setinformation();
//       call function setinformation
       gui.runGUI( game.thecards, game.player[0].getkrot(),
               game.player[1].getkrot()
               ,game.player[2].getkrot(),
               game.player[3].getkrot());
     the_turn_of_the_player(gui);
     game.updatescore();
     the_turn_of_the_dealer(gui);
     game.updatescore();
     check_the_game();
    }   
    public static void the_turn_of_the_player(GUI gui)
    {
        Scanner scanner=new Scanner(System.in);
        for(int i=0;i<game.player.length-1;i++){
          String input="";
            while(!input.toLowerCase().equals("stand")){
                   System.out.println("PLAYER NUMBER " + (i+1) + " WANT TO HIT OR STAND ");
            input = scanner.next();
        if(input.toLowerCase().equals("hit")){
            addingcardtotheplayer(i,gui);
        }
    }
    }
    }
    public static void addingcardtotheplayer(int index,GUI gui){
        Card card=game.draw();
        game.player[index].addcard(card);
        gui.updatePlayerHand(card, index);
    }
    public static void the_turn_of_the_dealer(GUI gui){
        boolean win=true;
        int highscore=0;
        for(int i=0;i<game.player.length;i++){
        if(game.highscore[i]>=game.player[3].score){
            win=false;
    }
        if(game.highscore[i]>highscore){
            highscore=game.highscore[i];   
        }
        if(!win){
            addingcardtothedealer(gui,highscore);
        }
        else
            return;
    }
}
    public static void addingcardtothedealer(GUI gui ,int highscore){
        while(game.player[3].score<highscore){
              Card card=game.draw();
        game.player[3].addcard(card);
        gui.updateDealerHand(card, game.thecards);
        }       
            }
    public static void check_the_game()
    {
        int highscore=0,winner=-1;
        for(int i=0;i<game.player.length;i++){
            if(game.highscore[i]>highscore){
                highscore=game.highscore[i];
                winner=i;
                    }
        }
        if(winner>=0){
            System.out.println("THE WINNER IS " +game.player[winner].Name+ " WITH SCORE " +highscore);
//            to know the winner and its score
        }
    }
}
