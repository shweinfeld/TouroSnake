package touro.snake;

import org.junit.Test;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

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
        FoodFactory foodFactory = mock(FoodFactory.class);
        Snake snake = mock(Snake.class);
        Garden garden = new Garden(snake, foodFactory);
        GardenView view = new GardenView(garden);
        Graphics g = mock(Graphics.class);
        int cellSize = 10;

        //when
        view.paintSnake(g);

        //then
        verify(g).fillRect(snake.getSquares().get(0).getX()*cellSize, snake.getSquares().get(0).getY()*cellSize, cellSize, cellSize);
        verify(g).fillRect(snake.getSquares().get(1).getX()*cellSize, snake.getSquares().get(1).getY()*cellSize, cellSize, cellSize);
        verify(g).fillRect(snake.getSquares().get(2).getX()*cellSize, snake.getSquares().get(2).getY()*cellSize, cellSize, cellSize);
        verify(g).fillRect(snake.getSquares().get(3).getX()*cellSize, snake.getSquares().get(3).getY()*cellSize, cellSize, cellSize);
        verify(g).fillRect(snake.getSquares().get(4).getX()*cellSize, snake.getSquares().get(4).getY()*cellSize, cellSize, cellSize);
        verify(g).fillRect(snake.getSquares().get(5).getX()*cellSize, snake.getSquares().get(5).getY()*cellSize, cellSize, cellSize);

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