import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class WarWindow extends JFrame {
    // WarWindow properties
    private final int windowWidth;
    private final int windowHeight;

    // Create container
    Container contentPane = getContentPane();


    // WarWindow constructor
    public WarWindow(int windowWidth, int windowHeight) {
        this.windowWidth = windowWidth;
        this.windowHeight = windowHeight;
    }

    // Open war window
    public void openWindow() throws IOException {
        // Set title
        setTitle("War!");

        // Set application quit on window close
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Set frame dimensions
        setSize(this.windowWidth, this.windowHeight);

        // Add background image panel
        contentPane.add(new WarTablePanel("/WarBgImage.jpeg", this.windowWidth, this.windowHeight));

    }

    public void loadCards(Player player) {
        JPanel cardsPanel = new JPanel();
        JLabel label = new JLabel(String.valueOf(player.getCard(0)));

        cardsPanel.setOpaque(false);

        cardsPanel.add(label);
        contentPane.add(cardsPanel);

        // Set frame visible to true
        setVisible(true);
    }
}
