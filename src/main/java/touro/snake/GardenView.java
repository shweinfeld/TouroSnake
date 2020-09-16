package touro.snake;

import javax.swing.*;
import java.awt.*;

public class GardenView extends JComponent {

    private final Garden garden;
    public static final int CELL_SIZE = 10;

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
        g.setColor(Color.RED);
        for (Square s : garden.getSnake().getSquares()) {
            g.fillRect(s.getX()*CELL_SIZE, s.getY()*CELL_SIZE, CELL_SIZE, CELL_SIZE);
        }
    }

    void paintFood(Graphics g) {
        // Berger
        throw new UnsupportedOperationException("Not Implemented Yet.");
    }
}
