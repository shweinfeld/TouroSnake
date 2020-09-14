package touro.snake;

import org.junit.Test;

import java.awt.*;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class GardenViewTest {

    @Test
    public void paintGrass() {
        throw new UnsupportedOperationException("Not Implemented Yet.");
    }

    @Test
    public void paintSnake() {
        //given
        GardenView view = mock(GardenView.class);
        Snake snake = mock(Snake.class);
        Graphics g = mock(Graphics.class);

        //when
        view.paintSnake(g);

        //then
        verify(g).fillRect(snake.getSquares().get(0).getX(), snake.getSquares().get(0).getY(), 20, 20);
        verify(g).fillRect(snake.getSquares().get(1).getX(), snake.getSquares().get(1).getY(), 20, 20);
        verify(g).fillRect(snake.getSquares().get(2).getX(), snake.getSquares().get(2).getY(), 20, 20);
        verify(g).fillRect(snake.getSquares().get(3).getX(), snake.getSquares().get(3).getY(), 20, 20);
        verify(g).fillRect(snake.getSquares().get(4).getX(), snake.getSquares().get(4).getY(), 20, 20);
        verify(g).fillRect(snake.getSquares().get(5).getX(), snake.getSquares().get(5).getY(), 20, 20);

    }

    @Test
    public void paintFood() {
        throw new UnsupportedOperationException("Not Implemented Yet.");
    }

    @Test
    public void paintFood_nullFood() {
        throw new UnsupportedOperationException("Not Implemented Yet.");
    }
}