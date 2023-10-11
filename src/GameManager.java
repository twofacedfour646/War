import java.io.IOException;

public class GameManager {
    private boolean playerTurn = false;
    private int playerScore = 0;
    private int computerScore = 0;
    private Player player1;
    private Player computer;

    // Begin game of war
    public void play() throws IOException {
        // Create window instance
        WarWindow window = new WarWindow(800, 700);

        // Create two players
        player1 = new Player();
        computer = new Player();

        // Load players' cards
        window.loadCards(player1);

        // Open game window
        window.openWindow();
    }
}
