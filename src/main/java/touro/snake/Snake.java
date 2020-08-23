package touro.snake;

import java.util.ArrayList;
import java.util.List;

/**
 * Model object that represents the Snake and allows it to grow, turn and move.
 */
public class Snake {

    private final List<Square> squares = new ArrayList<>();

    public List<Square> getSquares() {
        return squares;
    }

    /**
     * Grows the Snake one square.
     */
    public void grow() {
        throw new UnsupportedOperationException("Not Implemented Yet.");
    }

    /**
     * Turns the Snake head left.
     */
    public void left() {
        throw new UnsupportedOperationException("Not Implemented Yet.");
    }

    /**
     * Turns the Snake head right.
     */
    public void right() {
        throw new UnsupportedOperationException("Not Implemented Yet.");
    }

    /**
     * Moves the Snake forward in whatever direction the head is facing.
     */
    public void move() {
        throw new UnsupportedOperationException("Not Implemented Yet.");
    }

    public void contains(Food food) {
        throw new UnsupportedOperationException("Not Implemented Yet.");
    }

}
