import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.util.Objects;

public class WarTablePanel extends JPanel {
    private final Image backgroundImage;

    // Some code to initialize the background image.
    // Here, we use the constructor to load the image. This
    // can vary depending on the use case of the panel.
    public WarTablePanel(String fileName, int imageWidth, int imageHeight) throws IOException {
        backgroundImage = ImageIO.read(Objects.requireNonNull(getClass().getResource(fileName))).getScaledInstance(imageWidth, imageHeight, Image.SCALE_DEFAULT);

    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Draw the background image.
        g.drawImage(backgroundImage, 0, 0, this);
    }
}
