package touro.snake;

import org.junit.Test;

import java.awt.event.KeyEvent;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class SnakeKeyListenerTest {

    @Test
    public void keyPressed_left() {
        //given
        Snake snake = mock(Snake.class);
        SnakeKeyListener snakeKeyListener = new SnakeKeyListener(snake);
        KeyEvent keyEvent = mock(KeyEvent.class);

        //when
        when(keyEvent.getKeyCode()).thenReturn(KeyEvent.VK_LEFT);
        snakeKeyListener.keyPressed(keyEvent);

        //then
        verify(snake).turnTo(Direction.West);
    }

    @Test
    public void keyPressed_right() {
        //given
        Snake snake = mock(Snake.class);
        SnakeKeyListener snakeKeyListener = new SnakeKeyListener(snake);
        KeyEvent keyEvent = mock(KeyEvent.class);

        //when
        when(keyEvent.getKeyCode()).thenReturn(KeyEvent.VK_RIGHT);
        snakeKeyListener.keyPressed(keyEvent);

        //then
        verify(snake).turnTo(Direction.East);
    }

    @Test
    public void keyPressed_up() {
        //given
        Snake snake = mock(Snake.class);
        SnakeKeyListener snakeKeyListener = new SnakeKeyListener(snake);
        KeyEvent keyEvent = mock(KeyEvent.class);

        //when
        when(keyEvent.getKeyCode()).thenReturn(KeyEvent.VK_UP);
        snakeKeyListener.keyPressed(keyEvent);

        //then
        verify(snake).turnTo(Direction.North);
    }

    @Test
    public void keyPressed_down() {
        //given
        Snake snake = mock(Snake.class);
        SnakeKeyListener snakeKeyListener = new SnakeKeyListener(snake);
        KeyEvent keyEvent = mock(KeyEvent.class);

        //when
        when(keyEvent.getKeyCode()).thenReturn(KeyEvent.VK_DOWN);
        snakeKeyListener.keyPressed(keyEvent);

        //then
        verify(snake).turnTo(Direction.South);
    }

    @Test
    public void keyPressed_nonArrowKey() {
        //given
        Snake snake = mock(Snake.class);
        SnakeKeyListener snakeKeyListener = new SnakeKeyListener(snake);
        KeyEvent keyEvent = mock(KeyEvent.class);

        //when
        snakeKeyListener.keyPressed(keyEvent);

        //then
        verifyZeroInteractions(snake);
    }
}