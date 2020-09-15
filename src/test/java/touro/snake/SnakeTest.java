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
        int prevSize = previousSquares.size();
        int prevLastIndex = previousSquares.size() - 1;

        //when
        snake.move();

        //then
        List<Square> currentSquares = snake.getSquares();
        int currSize = currentSquares.size();
        int currLastIndex = currentSquares.size() - 1;
        int firstIndex = 0;

        //assert that the snake has not changed its size
        assertEquals(prevSize, currSize);

        //assert that new head has been created in the proper position
        assertEquals(previousSquares.get(firstIndex).getY() - 1, currentSquares.get(firstIndex).getY());

        //assert that the last square has been removed
        assertEquals(previousSquares.get(prevLastIndex).getX() - 1, currentSquares.get(currLastIndex).getX());

        //assert that the rest of the squares have remained in place
        for (int i = 0; i < currLastIndex; i++) {
            Square prevSquare = previousSquares.get(i);
            Square currSquare = currentSquares.get(i + 1);
            assertEquals(prevSquare,  currSquare);
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