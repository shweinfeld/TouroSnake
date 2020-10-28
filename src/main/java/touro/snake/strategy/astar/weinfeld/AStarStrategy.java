package touro.snake.strategy.astar.weinfeld;

import touro.snake.*;
import touro.snake.strategy.SnakeStrategy;
import touro.snake.strategy.astar.Node;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class AStarStrategy implements SnakeStrategy {


    List<Node> closed = new ArrayList<Node>();
    List<Node> pathList = new ArrayList<Node>();
    List<Node> open = new ArrayList<Node>();
    @Override
    public void turnSnake(Snake snake, Garden garden) {
        closed.clear();
        pathList.clear();
        open.clear();
        Direction directions[] = Direction.values();
        Food food = garden.getFood();
        Node head = new Node(snake.getHead());
        if (food == null) {
            return;
        }

        open.add(head);
        Node current = open.get(0);
        while (!open.isEmpty()) {
            current = getLowestCost(open);
            if (current.equals(food)) {
                break;
            }
            open.remove(current);
            closed.add(current);
            for(Direction d : directions) {
                Node neighbor = new Node(current.moveTo(d), current, food);
                if (snake.contains(neighbor) || !neighbor.inBounds() || closed.contains(neighbor)) {
                    continue;
                }
                if(open.contains(neighbor)) {
                    int neighborIndex = open.indexOf(neighbor);
                    Node oldNeighbor = open.get(neighborIndex);

                    if (neighbor.getCost() < oldNeighbor.getCost()) {
                        open.set(neighborIndex, neighbor);
                    }
                }else {
                    open.add(neighbor);
                }
            }

        }
        Node path = getFirstNode(head, current);
        Direction direction = head.directionTo(path);
        snake.turnTo(direction);

    }

    private Node getLowestCost(List<Node> nodes) {
        return nodes.stream()
                .min(Comparator.comparingDouble(Node::getCost))
                .get();
    }

    private Node getFirstNode(Node head, Node end) {
        Node n = end;
        while (!n.getParent().equals(head)) {
            n = n.getParent();
            pathList.add(n);
        }
        return n;
    }


    @Override
    public List<Square> getPath() {
        List<Square> path = new ArrayList<>();
        for (Node node: pathList) {
            path.add(new Square(node.getX(), node.getY()));
        }
        return path;
    }

    @Override
    public List<Square> getSearchSpace() {
        List<Square> searchSpace = new ArrayList<>();
        for (Node node: closed) {
            searchSpace.add(new Square(node.getX(), node.getY()));
        }
        return searchSpace;
    }


}
