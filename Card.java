package week4_oop;

public class Card {
    String suit;
    String rank;
   Card(String suit,String rank){
       this.suit = suit;
       this.rank = rank;
   }
   public String getSuit(){
       return suit;
   }
public String getRank(){
       return rank;
}

public String toString(){
       return String.format(" %s %s",suit,rank);
}
}
