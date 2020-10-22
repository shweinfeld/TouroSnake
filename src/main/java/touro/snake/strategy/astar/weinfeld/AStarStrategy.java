package touro.snake.strategy.astar.weinfeld;

import touro.snake.*;
import touro.snake.strategy.SnakeStrategy;
import touro.snake.strategy.astar.Node;

import java.util.ArrayList;

public class AStarStrategy implements SnakeStrategy {


    @Override
    public void turnSnake(Snake snake, Garden garden) {
        Direction directions[] = Direction.values();
        Node food = new Node(garden.getFood());
        Node head = new Node(snake.getHead());


        ArrayList<Node> open = new ArrayList<Node>();
        ArrayList<Node> closed = new ArrayList<Node>();
        open.add(head);
        Node current = open.get(0);
        while (!current.equals(food)) {
            for (Node node: open) {
                if (node.getCost()<current.getCost()) {
                    current = node;
                }
            }
            open.remove(current);
            closed.add(current);
            for(Direction d : directions) {
                Node neighbor = new Node(head.moveTo(d));
                if (snake.contains(neighbor) || !neighbor.inBounds() || closed.contains(neighbor)) {
                    continue;
                }
                if(!open.contains(neighbor)){ //or: if the neighbor IS in open and the current cost is less than previous
                    Node node = new Node(neighbor, current, food);
                    if(!open.contains(node)) {
                        open.add(node);
                    }
                }
            }

        }
        //now move to first node in path
    }


}
