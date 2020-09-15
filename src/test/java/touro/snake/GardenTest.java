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
        for (Square square : snakeBody) {
            if (food.getX()== square.getX() && food.getY() == square.getY()) {
                assertEquals(food.getX(), square.getX());
                assertEquals(food.getY(), square.getY());
            } else {
                assertTrue(food.getX() != square.getX() || food.getY() != square.getY());
            }
        }
    }
}