package tdd.marsrover;

import tdd.marsrover.exceptions.IllegalRoverCommandException;

public class Rover {
    private Direction direction;
    private int y;
    private int x;
    private int xBoundary = 5;
    private int yBoundary = 5;

    public Rover(int x, int y, Direction direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public Rover(int x, int y, Direction direction, int xBoundary, int yBoundary) {
        this.x = x;
        this.y = y;
        this.direction = direction;
        this.xBoundary = xBoundary;
        this.yBoundary = yBoundary;
    }


    public void setDirection(Direction direction) {
        this.direction = direction;
    }


    public Direction getDirection() {
        return direction;
    }

    public void doCommand(String commandLine) {
        final String[] commands = commandLine.split("");

        for (String command : commands) {
            if (command.equals("M")) {
                move();
            } else if (command.equals("L") || command.equals("R")) {
                rotate(command);
            } else {
                throw new IllegalRoverCommandException();
            }
        }
    }

    private void move() {
        switch (direction) {
            case NORTH:
                y++;

                break;
            case SOUTH:
                y--;
                break;
            case EAST:
                x++;

                break;
            case WEST:
                x--;

                break;
        }
        handleOutOfBoundaryMovement();
    }

    private void handleOutOfBoundaryMovement() {
        if (y >= yBoundary + 1) {
            y -= yBoundary + 1;
        }

        if (x >= xBoundary + 1) {
            x -= xBoundary + 1;
        }

        if (x < 0) {
            x += xBoundary + 1;
        }
        if (y < 0) {
            y += yBoundary + 1;
        }
    }

    private void rotate(String command) {
        if (command.equals("L")) {
            direction = direction.turnLeft();
        }

        if (command.equals("R")) {
            direction = direction.turnRight();
        }
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
