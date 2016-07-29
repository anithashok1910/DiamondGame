import java.util.Collections;
//
/**
 * Created by ashoka on 7/28/2016.
 */

public class Card implements Comparable {

    private int pip;
    private int suit;

    private static String[] suits = { "SPADES","HEARTS", "DIAMONDS", "CLUBS","JOKER" };
    private static String[] ranks  = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };


    public static String rankAsString() {
        return null;
    }

    public static String rankAsString(int pip ) {
        return ranks[pip];
    }

    Card(int suit, int pip) {
        this.pip=pip;
        this.suit=suit;
    }

    public String toString() {
        if(suit ==4)
            return suits[suit];
        else
            return ranks[pip] + " of " + suits[suit];
    }

    public int getPip() {
        return pip;
    }

    public int getSuit() {
        return suit;
    }


    @Override
    public int compareTo(Object c) {
        int value;
        if(this.getSuit() < ((Card)c).getSuit())
            return -1;
        else if(this.getSuit() > ((Card)c).getSuit())
            return 1;
        else{
            if(this.getPip() < ((Card)c).getPip())
               return -1;
            else if(this.getPip() > ((Card)c).getPip())
                return 1;
            else
                return 0;
        }
    }

}


