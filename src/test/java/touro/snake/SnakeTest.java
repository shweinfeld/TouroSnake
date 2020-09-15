package touro.snake;

import org.junit.Test;

import static org.junit.Assert.*;

import static org.mockito.Mockito.*;

public class SnakeTest {

    @Test
    public void grow() {
        throw new UnsupportedOperationException("Not Implemented Yet.");
    }

    @Test
    public void move() {
        throw new UnsupportedOperationException("Not Implemented Yet.");
    }

    @Test
    public void turnTo() {
        throw new UnsupportedOperationException("Not Implemented Yet.");
    }

    @Test
    public void contains_true() {
        throw new UnsupportedOperationException("Not Implemented Yet.");
    }

    @Test
    public void contains_false() {
        throw new UnsupportedOperationException("Not Implemented Yet.");
    }

    @Test
    public void eatsSelf_true() {
        throw new UnsupportedOperationException("Not Implemented Yet.");
    }

    @Test
    public void eatsSelf_false() {
        throw new UnsupportedOperationException("Not Implemented Yet.");
    }

    @Test
    public void inBounds_true()
    {
        //given
        SnakeHeadStateMachine snakeHeadStateMachine = mock(SnakeHeadStateMachine.class);
        Snake snake = new Snake(snakeHeadStateMachine);
        //when
        snake.move();
        //then
        assertTrue(snake.inBounds());
    }

    @Test
    public void inBounds_false() throws InterruptedException {
        //given
        SnakeHeadStateMachine snakeHeadStateMachine = mock(SnakeHeadStateMachine.class);
        Snake snake = new Snake(snakeHeadStateMachine);
        //when
        while(snake.inBounds())
        {
            snake.move();
        }
        //then
        assertFalse(snake.inBounds());
    }
}