package touro.snake;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class SnakeTest {

    @Test
    public void grow() {

        //if
        SnakeHeadStateMachine state = mock(SnakeHeadStateMachine.class);
        Snake snake = new Snake(state);
        when(state.getDirection()).thenReturn(Direction.North); //The direction of the head is irrelevant
        List<Square> Squares = snake.getSquares();

        //when
        snake.grow();

        //then
        assertEquals(7, Squares.size());

        // The snake is created facing east, so the last square should
        // have the same Y as the old last square but 1 more than the X
        assertEquals(Squares.get(Squares.size() - 1).getY(), Squares.get(Squares.size() - 2).getY());
        assertEquals(Squares.get(Squares.size() - 1).getX(), Squares.get(Squares.size() - 2).getX() + 1);

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
        throw new UnsupportedOperationException("Not Implemented Yet.");
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