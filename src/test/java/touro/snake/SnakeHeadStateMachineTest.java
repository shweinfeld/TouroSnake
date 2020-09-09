package touro.snake;

import org.junit.Test;

import static org.junit.Assert.*;

public class SnakeHeadStateMachineTest {

    @Test
    public void turnTo_eastToSouth() {
        Direction direction = Direction.East;
        Direction newDirection = Direction.South;
        SnakeHeadStateMachine machine = new SnakeHeadStateMachine(direction);
        machine.turnTo(newDirection);
        Direction result = machine.getDirection();
        assertEquals(Direction.South, result);
    }

    @Test
    public void turnTo_eastToNorth() {
        Direction direction = Direction.East;
        Direction newDirection = Direction.North;
        SnakeHeadStateMachine machine = new SnakeHeadStateMachine(direction);
        machine.turnTo(newDirection);
        Direction result = machine.getDirection();
        assertEquals(Direction.North, result);
    }

    @Test
    public void turnTo_westToSouth() {
        Direction direction = Direction.West;
        Direction newDirection = Direction.South;
        SnakeHeadStateMachine machine = new SnakeHeadStateMachine(direction);
        machine.turnTo(newDirection);
        Direction result = machine.getDirection();
        assertEquals(Direction.South, result);
    }

    @Test
    public void turnTo_westToNorth() {
        Direction direction = Direction.West;
        Direction newDirection = Direction.North;
        SnakeHeadStateMachine machine = new SnakeHeadStateMachine(direction);
        machine.turnTo(newDirection);
        Direction result = machine.getDirection();
        assertEquals(Direction.North, result);
    }

    @Test
    public void turnTo_southToEast() {
        Direction direction = Direction.South;
        Direction newDirection = Direction.East;
        SnakeHeadStateMachine machine = new SnakeHeadStateMachine(direction);
        machine.turnTo(newDirection);
        Direction result = machine.getDirection();
        assertEquals(Direction.East, result);
    }

    @Test
    public void turnTo_southToWest() {
        Direction direction = Direction.South;
        Direction newDirection = Direction.West;
        SnakeHeadStateMachine machine = new SnakeHeadStateMachine(direction);
        machine.turnTo(newDirection);
        Direction result = machine.getDirection();
        assertEquals(Direction.West, result);
    }

    @Test
    public void turnTo_northToEast() {
        Direction direction = Direction.North;
        Direction newDirection = Direction.East;
        SnakeHeadStateMachine machine = new SnakeHeadStateMachine(direction);
        machine.turnTo(newDirection);
        Direction result = machine.getDirection();
        assertEquals(Direction.East, result);
    }

    @Test
    public void turnTo_northToWest() {
        Direction direction = Direction.North;
        Direction newDirection = Direction.West;
        SnakeHeadStateMachine machine = new SnakeHeadStateMachine(direction);
        machine.turnTo(newDirection);
        Direction result = machine.getDirection();
        assertEquals(Direction.West, result);
    }

    @Test
    public void turnTo_southToNorth() {
        Direction direction = Direction.South;
        Direction newDirection = Direction.North;
        SnakeHeadStateMachine machine = new SnakeHeadStateMachine(direction);
        machine.turnTo(newDirection);
        Direction result = machine.getDirection();
        assertEquals(Direction.South, result);
    }

    @Test
    public void turnTo_northToSouth() {
        Direction direction = Direction.North;
        Direction newDirection = Direction.South;
        SnakeHeadStateMachine machine = new SnakeHeadStateMachine(direction);
        machine.turnTo(newDirection);
        Direction result = machine.getDirection();
        assertEquals(Direction.North, result);
    }

    @Test
    public void turnTo_eastToWest() {
        Direction direction = Direction.East;
        Direction newDirection = Direction.West;
        SnakeHeadStateMachine machine = new SnakeHeadStateMachine(direction);
        machine.turnTo(newDirection);
        Direction result = machine.getDirection();
        assertEquals(Direction.East, result);
    }

    @Test
    public void turnTo_westToEast() {
        Direction direction = Direction.West;
        Direction newDirection = Direction.East;
        SnakeHeadStateMachine machine = new SnakeHeadStateMachine(direction);
        machine.turnTo(newDirection);
        Direction result = machine.getDirection();
        assertEquals(Direction.West, result);
    }

    @Test
    public void checkOrientation_vertical(){
        Direction direction = Direction.North;
        Direction newDirection = Direction.South;
        SnakeHeadStateMachine machine = new SnakeHeadStateMachine(direction);
        boolean isVertical = machine.checkOrientation(newDirection);
        assertEquals(true,isVertical);
    }
    @Test
    public void checkOrientation_horizontal(){
        Direction direction = Direction.East;
        Direction newDirection = Direction.West;
        SnakeHeadStateMachine machine = new SnakeHeadStateMachine(direction);
        boolean isVertical = machine.checkOrientation(newDirection);
        assertEquals(false,isVertical);
    }
    @Test
    public void checkOrientation_same_vertical(){
        Direction direction = Direction.South;
        Direction newDirection = Direction.South;
        SnakeHeadStateMachine machine = new SnakeHeadStateMachine(direction);
        boolean isVertical = machine.checkOrientation(newDirection);
        assertEquals(true,isVertical);
    }
    @Test
    public void checkOrientation_same_horizontal(){
        Direction direction = Direction.East;
        Direction newDirection = Direction.East;
        SnakeHeadStateMachine machine = new SnakeHeadStateMachine(direction);
        boolean isVertical = machine.checkOrientation(newDirection);
        assertEquals(false,isVertical);
    }
}