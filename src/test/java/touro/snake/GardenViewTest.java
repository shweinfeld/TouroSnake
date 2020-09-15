package touro.snake;

import org.junit.Test;

import java.awt.*;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GardenViewTest {

    @Test
    public void paintGrass() {
        //given
        GardenView view = mock(GardenView.class);
        int width = view.getWidth();
        int height = view.getHeight();

        Graphics g = mock(Graphics.class);

        //when
        view.paintGrass(g);

        //then
        verify(g).fillRect(0, 0, width, height);
    }

    @Test
    public void paintSnake() {
        throw new UnsupportedOperationException("Not Implemented Yet.");
    }

    @Test
    public void paintFood() {
        //given
        GardenView view = mock(GardenView.class);
        int CELL_SIZE = 20;

        FoodFactory ff = new FoodFactory();
        Food food = ff.newInstance();
        int x = food.getX() * CELL_SIZE;
        int y = food.getY() * CELL_SIZE;

        Graphics g = mock(Graphics.class);

        //when
        view.paintFood(g);

        //then
        verify(g).fillRect(x,y, CELL_SIZE, CELL_SIZE);
    }

    @Test
    public void paintFood_nullFood() {
        //given
        GardenView view = mock(GardenView.class);
        Graphics g = mock(Graphics.class);

        //when
        view.paintFood(g);

        //then
        verifyNoInteractions(g);
    }
}