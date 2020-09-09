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
        throw new UnsupportedOperationException("Not Implemented Yet.");
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

        //get direction
        Direction direction = snakeHeadStateMachine.getDirection();

        //save head position in variable previous square
        Square previousSquare = getHead();
        int x = previousSquare.getX();
        int y = previousSquare.getY();

        //move head one square in proper direction (assumes origin is on the top left corner)
        Square newSquare = previousSquare;
        switch (direction) {
            case North:
                newSquare = new Square(x, y - 1);
                break;
            case East:
                newSquare = new Square(x + 1, y);
                squares.set(0, newSquare);
                break;
            case South:
                newSquare = new Square(x, y + 1);
                break;
            case West:
                newSquare = new Square(x - 1, y);
                break;
        }
        squares.set(0, newSquare);

        //for the rest of the squares in snake:
        for (int i = 1; i < squares.size(); i ++) {

            //save current square position
            Square currentSquare = squares.get(i);

            //move square into previous square
            squares.set(i, previousSquare);

            //previous square = current square
            previousSquare = currentSquare;
        }

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
