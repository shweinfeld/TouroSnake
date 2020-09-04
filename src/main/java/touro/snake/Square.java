package touro.snake;

import java.util.Objects;

/**
 * Super class of all objects in the Garden.
 */
public class Square {
    private final int x;
    private final int y;

    public Square(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Square)) return false;
        Square segment = (Square) o;
        return x == segment.x &&
                y == segment.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
