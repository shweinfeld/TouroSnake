package touro.snake;

import org.junit.Test;


import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

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
        SnakeHeadStateMachine headStateMock = mock(SnakeHeadStateMachine.class);
        Snake snake = new Snake(headStateMock);

        Square middleSquare = new Square(50,20);  //create a square on the snake with X and Y coordinates
        Square headSquare = new Square(50,20);
        List<Square> list = snake.getSquares();
        list.set(4,middleSquare);
        list.set(0,headSquare);

        //WHEN
       boolean val = snake.eatsSelf();

        //THEN
        assertTrue(val);

    }

    @Test
    public void eatsSelf_false() {

        //IF
        SnakeHeadStateMachine headStateMock = mock(SnakeHeadStateMachine.class);
        Snake snake = new Snake(headStateMock);

        //WHEN
        boolean val = snake.eatsSelf();

        //THEN
        assertFalse(val);

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