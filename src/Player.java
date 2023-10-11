import java.util.Arrays;
import java.util.Random;

public class Player {
    private PlayingCard[] playerCards = new PlayingCard[25];
    private final String[] suits = {"heart", "spade", "club", "diamond"};
    private final int[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

    public Player() {
        // Loop through 25 times to populate playerCards
        for (int i = 0; i < 25; i++) {
            Random randomizer = new Random();
            playerCards[i] = new PlayingCard(suits[randomizer.nextInt(4)], values[randomizer.nextInt(12)]);
        }

        System.out.println(Arrays.toString(playerCards));
    }

    // Get current card
    public PlayingCard getCard(int index) {
        return this.playerCards[index];
    }
}
