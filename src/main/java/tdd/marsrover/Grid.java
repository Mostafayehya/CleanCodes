package tdd.marsrover;

public class Grid {
    private final int width;
    private final int height;

    public Grid(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int yBoundary() {
        return height;
    }

    public int xBoundary() {
        return width;
    }

    public Position wrapPosition(Position position) {
        int x = position.getX();
        int y = position.getY();

        // Handle wrapping for x coordinate
        if (x > width) {
            x = 0;
        } else if (x < 0) {
            x = width;
        }

        // Handle wrapping for y coordinate
        if (y > height) {
            y = 0;
        } else if (y < 0) {
            y = height;
        }

        return new Position(x, y);
    }
}
