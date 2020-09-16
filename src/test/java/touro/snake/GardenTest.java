package touro.snake;

import org.junit.Test;

import java.util.List;

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
        Food food = mock(Food.class);
        FoodFactory foodFactory = mock(FoodFactory.class);
        Snake snake = mock(Snake.class);
        doReturn(snake.contains(food)).when(snake).contains(food);
        Garden garden = new Garden(snake, foodFactory);

        //when
        garden.createFoodIfNecessary();

        //then
        assertNotNull(food);
        assertFalse(snake.contains(food));
    }
}