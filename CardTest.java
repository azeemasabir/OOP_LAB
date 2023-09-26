package week4_oop;

public class CardTest {
    public static void main(String[] args) {
        Card c1 = new Card("club", "Ace");
        Card c2 = new Card("club", "Ace");
        // System.out.println(c1.equals(c2));
        Deck d1 = new Deck();
        System.out.println(d1);
        Card random = d1.getRandom();
        System.out.println("Random Card : " + random);
        d1.shuffle();
        System.out.println(d1);
    }
}
