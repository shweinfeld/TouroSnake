package touro.snake;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * KeyListener that is responsible for turning the Snake.
 */
public class SnakeTurnListener extends KeyAdapter {

    private final Snake snake;

    public SnakeTurnListener(Snake snake) {
        this.snake = snake;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        super.keyPressed(e);
        throw new UnsupportedOperationException("Not Implemented Yet.");
        // turns the head of the snake left or right depending on the key pressed.
    }
}
