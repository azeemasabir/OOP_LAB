package week4_oop;

import java.util.Random;

public class Deck {
    Card deck [] = new Card[52];
    String suits [] = new String [4];
    {
        suits[0] = "Clubs";
        suits[1] = "Hearts";
        suits[2] = "Diamonds";
        suits[3] = "Spades";
    }
    String ranks[] = { "Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
    Deck(){
        int counter = 0;
        for(int j=0;j<4;j++){
            for(int i=0;i<13;i++){
                deck[counter++] = new Card(suits[j],ranks[i]);

            }
        }
    }
public String toString(){
    StringBuilder str  = new StringBuilder();
    for(int i = 0;i<52;i++)
        str.append(deck[i]+"\n");

        return str.toString();

}
public Card getRandom(){

    Random no = new Random();
    int ran = no.nextInt(52);
    return deck[ran];
}
public void shuffle() {
    Random random = new Random();
    for (int i = 0; i < 6000; i++) {

        int randomIndex = random.nextInt(52);
        Card temp = deck[randomIndex];
        deck[randomIndex] = deck[0];
        deck[0] = temp;
    }
}
}
