import java.util.ArrayList;
import java.util.Collections;

class Deck{
    ArrayList<Card> cards = new ArrayList<>();

    Deck(int numberOfPacks){
        PackWithJoker Pack = new PackWithJoker(numberOfPacks);
        cards = Pack.getPackOfCards();
        }

    public void Shuffle(){
        Collections.shuffle(cards);
    }

    public ArrayList<Card> takeCards(int number){
        ArrayList<Card> UserCardSet = new ArrayList<>();
        for(int i =0;i<number;i++){
            UserCardSet.add(cards.get(i));
        }
        return UserCardSet;
    }

}