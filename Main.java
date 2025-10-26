public class Main {

    public static Card[] makeDeck(){
        String[] suits = {"Hearts","Diamonds","Spades","Clubs"};
        String[] values = {"Ace","2","3","4","5","6","7","8","9","10","King","Queen","Jack"};
        Card[] deck = new Card[52];

        // make deck
        int index = 0;
        for(String suit : suits) {
            for(String value : values) {
                deck[index] = new Card(suit,value);
                index++;
            }
        }
        return deck;
    }

    public static void printDeck(Card[] deck) {
        int counter = 1;
        for(Card card : deck) {
            System.out.println(counter+".) "+card);
            counter++;
        }
    }

    public static void shuffleDeck(Card[] deck) {
        for(int i = 0; i < deck.length; i++) {
            int randomNum = (int)(Math.random() * 52);
            Card temp = deck[randomNum];
            deck[randomNum] = deck[i];
            deck[i] = temp;
        }
    }

    public static int randomCard() {
        return (int)(Math.random() * 52);
    }

    public static Card[] dealHand (Card[] deck, int amount) {
        Card[] hand = new Card[amount];
        for(int i = 0; i < hand.length; i++) {
            hand[i] = deck[i];
        }
        return hand;
    }

    public static void main(String[] args) {

        Card[] deck = makeDeck();
        System.out.println("\n----- Original Deck -----");
        printDeck(deck);
        System.out.println("---------------------------");

        System.out.println("\n----- Original Hand (10 cards) -----");
        Card[] hand = dealHand(deck,10);
        printDeck(hand);
        System.out.println("--------------------------------------");

        shuffleDeck(deck);

        System.out.println("\n----- Shuffled Hand (10 cards) -----");
        hand = dealHand(deck,10);
        printDeck(hand);
        System.out.println("-------------------------------------");

        System.out.println("\n----- Random Card -----");
        System.out.println(deck[randomCard()]);
        System.out.println("-----------------------");



    }
}
