package week4_oop;

public class Player {
        private String name;
        private Card[] hand = new Card[4];

        public Player(String name) {
            this.name = name;
        }
    public void receiveCard(Card card, int index) {
        if (index >= 0 && index < 4) {
            hand[index] = card;
        }
    }
    public void displayHand() {
        System.out.println(name + "'s hand:");
        for (int i = 0; i < 4; i++) {
            System.out.println(hand[i]);
        }
    }
}
