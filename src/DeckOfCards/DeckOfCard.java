package DeckOfCards;

import java.util.Random;

public class DeckOfCard {
    String rank[] = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
    String suits[] = {"Clubs", "Diamonds", "Hearts", "Spades"};


    public  String[][] returnCard() {
        Random random = new Random();
        int num =9;
//        String card[][] = new String[9][9];
//       for(int i=0;i<=8;i++){
//           int rankPosition = random.nextInt(13);
//           int suitsPosition = random.nextInt(4);
//           String rankValue = rank[rankPosition];
//           String suitsValue = suits[suitsPosition];
//           card[i][0]=rankValue;
//       }
//        for(int i=0;i<=8;i++){
//            int rankPosition = random.nextInt(13);
//            int suitsPosition = random.nextInt(4);
//            String rankValue = rank[rankPosition];
//            String suitsValue = suits[suitsPosition];
//            card[0][i]=suitsValue;
//        }
            int rankPosition = random.nextInt(13);
            int suitsPosition = random.nextInt(4);
            String rankValue = rank[rankPosition];
            String suitsValue = suits[suitsPosition];

        String card[][] = {{rankValue,suitsValue}};
        return card;
    }
}