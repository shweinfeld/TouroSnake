package touro.snake.strategy.astar.weinfeld;

import touro.snake.*;
import touro.snake.strategy.SnakeStrategy;
import touro.snake.strategy.astar.Node;

import java.util.ArrayList;

public class AStarStrategy implements SnakeStrategy {


    @Override
    public void turnSnake(Snake snake, Garden garden) {
        Direction directions[] = Direction.values();
        Food tempFood = garden.getFood();
        if (tempFood == null) {
            return;
        }
        Node food = new Node(tempFood);
        Node head = new Node(snake.getHead());

        ArrayList<Node> open = new ArrayList<Node>();
        ArrayList<Node> closed = new ArrayList<Node>();
        open.add(head);
        Node current = open.get(0);
        while (!current.equals(food)) {
            current = open.get(0);
            for (Node node: open) {
                if (node.getCost()<current.getCost()) {
                    current = node;
                }
            }
            open.remove(current);
            closed.add(current);
            for(Direction d : directions) {
                Node neighbor = new Node(current.moveTo(d));
                if (snake.contains(neighbor) || !neighbor.inBounds() || closed.contains(neighbor)) {
                    continue;
                }
                if(open.contains(neighbor)) {
                    int neighborIndex = open.indexOf(neighbor);
                    Node oldNeighbor = open.get(neighborIndex);
                    Node newNeighbor = new Node(neighbor, current, food);

                    if (newNeighbor.getCost() < oldNeighbor.getCost()) {
                        open.set(neighborIndex, newNeighbor);
                    }
                }
                if(!open.contains(neighbor)){
                    Node node = new Node(neighbor, current, food);
                    open.add(node);
                }
            }

        }
        //find first node in path
        Node path = new Node(current);
        while(current != head) {
            path = current;
            current = current.getParent();
        }
        //now move to first node in path
        Direction direction;
        if(path.getX() == head.getX() && path.getY() == head.getY() - 1) {
            direction = Direction.North;
        }
        else if(path.getX() == head.getX() && path.getY()== head.getY() + 1 ) {
            direction = Direction.South;
        }
        else if(path.getX() == head.getX() + 1 && path.getY() == head.getY()) {
            direction = Direction.East;
        }
        else if(path.getX() == head.getX() - 1 && path.getY() == head.getY()) {
            direction = Direction.West;
        }
        else {
            throw new RuntimeException("ERROR: There is no where to turn");
        }

        snake.turnTo(direction);

    }


}
