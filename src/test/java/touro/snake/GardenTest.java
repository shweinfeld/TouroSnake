package touro.snake;

import org.junit.Test;
import org.mockito.Mockito;

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
        SnakeHeadStateMachine state = new SnakeHeadStateMachine(Direction.North);
        Snake snake = new Snake(state);
        FoodFactory foodFactory = new FoodFactory();
        Garden garden = new Garden(snake, foodFactory);
        List<Square> snakeBody = snake.getSquares();

        //when
        garden.createFoodIfNecessary();

        //then
        int x = foodFactory.newInstance().getX();
        int y = foodFactory.newInstance().getY();

        Square square = new Square(x, y);

        assertNotEquals(snakeBody, square);
    }
}