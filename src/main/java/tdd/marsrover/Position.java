package tdd.marsrover;

public class Position {
    private  Grid grid = new Grid(5, 5);
    private int x;
    private int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Position(int x, int y, Grid grid) {
        this.x = x;
        this.y = y;
        this.grid = grid;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return y;
    }

    public void moveNorth() {
        y += 1;
        if (y >= grid.yBoundary() + 1) {
            y -= grid.yBoundary() + 1;
        }
    }

    public void moveSouth() {
        y -= 1;

        if (y < 0) {
            y += grid.yBoundary() + 1;
        }

    }

    public void moveEast() {
        x += 1;
        if (x >= grid.xBoundary() + 1) {
            x -= grid.xBoundary() + 1;
        }
    }

    public void moveWest() {
        x -= 1;
        if (x < 0) {
            x += grid.xBoundary() + 1;
        }

    }
}
