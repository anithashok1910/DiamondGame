import java.util.ArrayList;

/**
 * Created by ashoka on 7/28/2016.
 */
public class PackWithoutJoker extends Pack {
    ArrayList<Card> PackOfCards;

    public PackWithoutJoker(){
        PackOfCards = new ArrayList<>();
        for(int i = 0; i < 4 ; i++)
            for(int k = 0; k < 13; k++){
                Card card = new Card(i,k);
                PackOfCards.add(card);
            }
        }

    public int sizeOfPack(){
        return PackOfCards.size();
    }

    public ArrayList<Card> getPackOfCards(){
        return PackOfCards;
    }

    public String toString(){
        String Pack ="";
        for(Card c : PackOfCards){
            Pack += c.toString()+"\n";
        }
        return Pack;
    }
}
