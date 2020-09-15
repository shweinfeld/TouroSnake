package touro.snake;

public class Food extends Square {

    public Food(int x, int y) {
        super(x, y);
    }

    public Food(Square square)
    {
        super(square.getX(), square.getY());

    }
}
