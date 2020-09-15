package touro.snake;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

public class GardenTest {

    @Test
    public void moveSnake() {
        throw new UnsupportedOperationException("Not Implemented Yet.");
    }

    @Test
    public void createFoodIfNecessary() {

        //if
        Snake snake = mock(Snake.class);
        FoodFactory foodFactory = mock(FoodFactory.class);
        Food food = mock(Food.class);
        Garden garden = new Garden(snake, foodFactory);
        List<Square> snakeBody = snake.getSquares();

        //when
        garden.createFoodIfNecessary();

        //then
        for (int i = 0; i < snakeBody.size(); i++) {
            if (food.equals(i)) {
                ;
            } else {
                foodFactory.newInstance();
            }
        }
    }
}