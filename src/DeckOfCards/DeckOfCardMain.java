package DeckOfCards;

import java.util.Arrays;

public class DeckOfCardMain {
    public static void main(String[] args) {
        DeckOfCard deckOfCard = new DeckOfCard();
        System.out.println(Arrays.deepToString(deckOfCard.returnCard()));
    }
}
