import javax.swing.*;
import java.awt.*;

public class DeadpoolDrawing extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        // Set rendering hints for smooth edges
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Define the size and position for the Deadpool head
        int centerX = getWidth() / 2;
        int centerY = getHeight() / 2;
        int headWidth = 200;
        int headHeight = 250;

        // Draw the head (red oval)
        g2d.setColor(Color.RED);
        g2d.fillOval(centerX - headWidth / 2, centerY - headHeight / 2, headWidth, headHeight);

        // Draw the black patches around the eyes
        g2d.setColor(Color.BLACK);
        int patchWidth = 80;
        int patchHeight = 100;
        int patchXOffset = 40;
        int patchYOffset = 20;

        // Left patch
        g2d.fillOval(centerX - patchXOffset - patchWidth, centerY - patchYOffset, patchWidth, patchHeight);

        // Right patch
        g2d.fillOval(centerX + patchXOffset, centerY - patchYOffset, patchWidth, patchHeight);

        // Draw the white part of the eyes
        g2d.setColor(Color.WHITE);
        int eyeWidth = 40;
        int eyeHeight = 50;
        int eyeXOffset = 50;
        int eyeYOffset = 10;

        // Left eye
        g2d.fillOval(centerX - eyeXOffset - eyeWidth / 2, centerY - eyeYOffset - eyeHeight / 2, eyeWidth, eyeHeight);

        // Right eye
        g2d.fillOval(centerX + eyeXOffset - eyeWidth / 2, centerY - eyeYOffset - eyeHeight / 2, eyeWidth, eyeHeight);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Deadpool Drawing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 600);
        frame.setLocationRelativeTo(null);

        DeadpoolDrawing panel = new DeadpoolDrawing();
        frame.add(panel);
        frame.setVisible(true);
    }
}
