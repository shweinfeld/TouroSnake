package touro.snake;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class SnakeTest {

    @Test
    public void grow() {
        throw new UnsupportedOperationException("Not Implemented Yet.");
    }

    @Test
    public void move() {
        throw new UnsupportedOperationException("Not Implemented Yet.");
    }

    @Test
    public void turnTo() {
        throw new UnsupportedOperationException("Not Implemented Yet.");
    }

    @Test
    public void contains_true() {
        throw new UnsupportedOperationException("Not Implemented Yet.");
    }

    @Test
    public void contains_false() {
        throw new UnsupportedOperationException("Not Implemented Yet.");
    }

    @Test
    public void eatsSelf_true() {
        //IF
        Direction direction = Direction.South;
        SnakeHeadStateMachine headState = new SnakeHeadStateMachine(direction);
        Snake snake = new Snake(headState);
        List<Square> squareList = new ArrayList<>(snake.getSquares());
        Square middleSquare = new Square(4,5); //create a square on the snake with X and Y coordinates
        Square headSquare = new Square(4,5); //hardcoding coordinates because I'm not using the "move" method
        squareList.add(middleSquare);
        squareList.add(headSquare);

        //set the 5th and head squares in snake list
        squareList.set(5, middleSquare);
        squareList.set(0, headSquare);

        //WHEN
       // snake.eatsSelf();

        //THEN
        assertTrue(snake.eatsSelf());

    }

    @Test
    public void eatsSelf_false() {
        throw new UnsupportedOperationException("Not Implemented Yet.");
    }

    @Test
    public void inBounds_true() {
        throw new UnsupportedOperationException("Not Implemented Yet.");
    }

    @Test
    public void inBounds_false() {
        throw new UnsupportedOperationException("Not Implemented Yet.");
    }
}