public class PlayingCard {
    private String suit;
    private int value;

    public PlayingCard(String suit, int value) {
        this.suit = suit;
        this.value = value;
    }

    @Override
    public String toString() {
        return this.suit + " " + this.value;
    }
}
