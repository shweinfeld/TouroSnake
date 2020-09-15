package touro.snake;

import java.util.ArrayList;
import java.util.List;

import static touro.snake.Direction.*;

/**
 * Model object that represents the Snake and allows it to grow, turn and move.
 */
public class Snake {

    private static final int START_LENGTH = 6;

    private final List<Square> squares = new ArrayList<>();

    private final SnakeHeadStateMachine snakeHeadStateMachine;

    public Snake(SnakeHeadStateMachine snakeHeadStateMachine) {
        this.snakeHeadStateMachine = snakeHeadStateMachine;
        createSnake();
    }

    /**
     * Creates the Snake of length START_LENGTH, starting at the middle of the Garden.
     */
    private void createSnake() {
        int x = Garden.WIDTH / 2;
        int y = Garden.HEIGHT / 2;
        for (int i=0; i<START_LENGTH; i++) {
            squares.add(new Square(x+i, y));
        }
    }

    public List<Square> getSquares() {
        return squares;
    }

    /**
     * Grows the Snake one square.
     */
    public void grow() {

        Square lastSquare = squares.get(squares.size()-1);
        Square secondToLastSquare = squares.get(squares.size()-2);
        Square newSquare;
        if (lastSquare.getX() == secondToLastSquare.getX()) {
            if (lastSquare.getY() + 1 == secondToLastSquare.getY()) {
                newSquare = new Square(lastSquare.getX(), lastSquare.getY() - 1);
            }
            else {
                newSquare = new Square(lastSquare.getX(), lastSquare.getY() + 1);
            }
        }
        else {
            if (lastSquare.getX() + 1 == secondToLastSquare.getX()) {
                newSquare = new Square(lastSquare.getX() - 1, lastSquare.getY());
            }
            else {
                newSquare = new Square(lastSquare.getX() + 1, lastSquare.getY());
            }
        }
        squares.add(newSquare);

    }

    public void turnTo(Direction newDirection) {
        snakeHeadStateMachine.turnTo(newDirection);
    }

    public Square getHead() {
        return squares.get(0);
    }

    /**
     * Moves the Snake forward in whatever direction the head is facing.
     */
    public void move() {
        // Weinfeld
        throw new UnsupportedOperationException("Not Implemented Yet.");
    }

    /**
     * @param food
     * @return true if the Food intersects with the Snake, otherwise false.
     */
    public boolean contains(Food food) {
        return squares.contains(food);
    }

    /**
     * @return true if the Snake is within the bounds of the Garden, otherwise false.
     */
    public boolean inBounds() {
        // Aufrichtig
        throw new UnsupportedOperationException("Not Implemented Yet.");
    }

    /**
     * @return true if the head of the Snake has intersected with itself, otherwise false.
     */
    public boolean eatsSelf() {
        // Alter
        throw new UnsupportedOperationException("Not Implemented Yet.");
    }

}
