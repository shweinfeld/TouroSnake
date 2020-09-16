package touro.snake;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GardenTest {

    @Test
    public void moveSnake() {
        throw new UnsupportedOperationException("Not Implemented Yet.");
    }

    @Test
    public void createFoodIfNecessary() {

        //given
        Snake snake = mock(Snake.class);
        FoodFactory foodFactory = mock(FoodFactory.class);
        Garden garden = new Garden(snake, foodFactory);
        when(foodFactory.newInstance()).thenReturn(garden.getFood());

        //when
        garden.createFoodIfNecessary();

        //then
        //this passes
        verify(foodFactory).newInstance();
        //this does not pass
        assertNotNull(garden.getFood());
    }
}