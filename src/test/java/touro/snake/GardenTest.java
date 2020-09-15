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
        SnakeHeadStateMachine state = mock(SnakeHeadStateMachine.class);
        Snake snake = new Snake(state);
        FoodFactory foodFactory = mock(FoodFactory.class);
        Garden garden = new Garden(snake, foodFactory);
        int x = 0;
        int y = 0;
        Food food = new Food(x,y);
        List<Square> snakeBody = snake.getSquares();

        //when
        garden.createFoodIfNecessary();

        //then
        for (Square square : snakeBody) {
            assertTrue(food.getX() != square.getX() || food.getY() != square.getY());
        }
    }
}