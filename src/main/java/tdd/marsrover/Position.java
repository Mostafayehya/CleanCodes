package tdd.marsrover;

import java.util.Objects;

public final class Position {
    private final int x;
    private final int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Position(int x, int y, Grid grid) {
        // For backward compatibility with tests
        this(x, y);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Position move(Direction direction) {
        switch (direction) {
            case NORTH:
                return new Position(x, y + 1);
            case SOUTH:
                return new Position(x, y - 1);
            case EAST:
                return new Position(x + 1, y);
            case WEST:
                return new Position(x - 1, y);
            default:
                return this;
        }
    }

    // Legacy methods for backward compatibility - will be removed later
    public void moveNorth() {
        throw new UnsupportedOperationException("Use move(Direction.NORTH) instead");
    }

    public void moveSouth() {
        throw new UnsupportedOperationException("Use move(Direction.SOUTH) instead");
    }

    public void moveEast() {
        throw new UnsupportedOperationException("Use move(Direction.EAST) instead");
    }

    public void moveWest() {
        throw new UnsupportedOperationException("Use move(Direction.WEST) instead");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Position position = (Position) o;
        return x == position.x && y == position.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
