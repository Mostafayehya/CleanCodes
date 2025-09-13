package tdd.marsrover;

public class Grid {
    private int x;
    private int y;

    public Grid(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int yBoundary() {
        return y;
    }

    public int xBoundary() {
        return x;
    }
}
