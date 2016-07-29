import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

/**
 * Created by shadabm on 7/29/2016.
 */
public class GameDiamond {

    final int SUIT = 1;
    Player firstPlayer;
    Banker banker;



    final static int suitSize = 13;


    public GameDiamond(){
        this.firstPlayer = new Player(SUIT);

        this.banker = new Banker(getDiamondsuits());
    }

    public ArrayList<Card> getDiamondsuits() {
        int suit=2;
        ArrayList<Card> pack = new ArrayList();
        for( int i=0; i<suitSize; i++){
            Card c = new Card(suit,i);
            pack.add(c);
        }
        return pack;
    }

    public static void main(String[] args) {
        GameDiamond game = new GameDiamond();
        float userScore=0;
        for(int i=0; i< suitSize; i++) {
            Card topCard = banker.showTopCard();
            System.out.print(topCard.toString());
            Scanner sc = new Scanner(System.in);
            int userResponse = sc.nextInt();
            int firstPlayerResponse = firstPlayer.bid(topCard.getPip());
            if( banker.getBidValues( firstPlayerResponse,userResponse) == firstPlayerResponse){
                firstPlayer.updateScore(topCard.getPip());
                firstPlayer.updateCurrency(firstPlayerResponse);

            }else if(banker.getBidValues( firstPlayerResponse,userResponse) == userResponse){
                userScore += topCard.getPip();

            }else{
                firstPlayer.updateScore(topCard.getPip()/2);
                userScore += topCard.getPip()/2;
            }

        }
        if(userScore > this.firstPlayer.getScore()){
            System.out.println("User win!!");
        }else{
            System.out.println("Computer win!!");
        }


    }
}
