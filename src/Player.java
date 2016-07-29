import java.util.AbstractCollection;
import java.util.ArrayList;

/**
 * Created by Anith Ashok on 7/29/2016.
 */
public class Player {
    private ArrayList<Card> playerCardSet;
    private int score;
    private int currency;

    public Player(ArrayList<Card> CardSet){
        playerCardSet = CardSet;
        score = 0;
        for(int i = 0; i<13; i++)
            currency += playerCardSet.get(i).getPip();
        currency += 13;
    }

    public int getScore(){
        return score;
    }

    public int getCurrency(){
        return currency;
    }

    public void updateScore(int score){
        this.score += score;
    }

    public void updateCurrency(int bidAmount) {
        this.currency -= bidAmount;
    }

    public int bid(){
        int cardValue = (int)(Math.random()*playerCardSet.size());
        playerCardSet.remove(cardValue);
        return cardValue;
    }
}

