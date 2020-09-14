package touro.snake;

import javax.swing.*;
import java.awt.*;

public class GardenView extends JComponent {

    private final Garden garden;
    private Snake snake;
    private final int CELL_SIZE = 20;

    public GardenView(Garden garden) {
        this.garden = garden;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        paintGrass(g);
        paintFood(g);
        paintSnake(g);
    }

    void paintGrass(Graphics g) {
        // Berger
        throw new UnsupportedOperationException("Not Implemented Yet.");
    }

    void paintSnake(Graphics g) {
        // Orlian
        for (Square s : snake.getSquares()) {
            g.setColor(Color.RED);
            g.fillRect(s.getX(), s.getY(), CELL_SIZE, CELL_SIZE);
        }
    }

    void paintFood(Graphics g) {
        // Berger
        throw new UnsupportedOperationException("Not Implemented Yet.");
    }
}
