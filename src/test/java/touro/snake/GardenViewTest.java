package touro.snake;

import org.junit.Test;

import java.awt.*;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GardenViewTest {

    @Test
    public void paintGrass() {
        //given
        Garden garden = mock(Garden.class);
        GardenView view = new GardenView(garden);
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
        Garden garden = mock(Garden.class);
        GardenView view = new GardenView(garden);

        when(garden.getFood()).thenReturn(mock(Food.class));

        Food food = garden.getFood();
        when(food.getX()).thenReturn(5);
        when(food.getY()).thenReturn(10);
        int x = food.getX() * GardenView.CELL_SIZE;
        int y = food.getY() * GardenView.CELL_SIZE;

        Graphics g = mock(Graphics.class);

        //when
        view.paintFood(g);

        //then
        verify(g).fillRect(x,y, GardenView.CELL_SIZE, GardenView.CELL_SIZE);
    }

    @Test
    public void paintFood_nullFood() {
        //given
        Garden garden = mock(Garden.class);
        GardenView view = new GardenView(garden);
        Graphics g = mock(Graphics.class);

        //when
        view.paintFood(g);

        //then
        verifyNoInteractions(g);
    }
}