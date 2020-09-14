package touro.snake;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class SnakeTest {

    @Test
    public void grow() {
        throw new UnsupportedOperationException("Not Implemented Yet.");
    }

    @Test
    public void move() {

        //if
        SnakeHeadStateMachine state = mock(SnakeHeadStateMachine.class);
        Snake snake = new Snake(state);
        when(state.getDirection()).thenReturn(Direction.North);
        List<Square> previousSquares = new ArrayList<>(snake.getSquares());

        //when
        snake.move();

        //then
        List<Square> currentSquares = snake.getSquares();
        assertEquals(previousSquares.get(0).getY() - 1, currentSquares.get(0).getY());
        for(int i = 1; i < currentSquares.size(); i++) {
            assertEquals(previousSquares.get(i - 1).getY(), currentSquares.get(i).getY());
            assertEquals(previousSquares.get(i - 1).getX(), currentSquares.get(i).getX());
        }
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