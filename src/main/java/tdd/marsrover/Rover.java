package tdd.marsrover;

import tdd.marsrover.exceptions.IllegalRoverCommandException;

public class Rover {
    private Direction direction;
    private Position position;
    private Grid grid;

    public Rover(Position position, Direction direction) {
        this.position = position;
        this.direction = direction;
        this.grid = new Grid(5, 5); // Default grid
    }

    public Rover(Position position, Direction direction, Grid grid) {
        this.position = position;
        this.direction = direction;
        this.grid = grid;
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
        Position newPosition = position.move(direction);
        position = grid.wrapPosition(newPosition);
    }



    private void rotate(String command) {
        if (command.equals("L")) {
            direction = direction.turnLeft();
        }

        if (command.equals("R")) {
            direction = direction.turnRight();
        }
    }

    public Position getPosition() {
        return position;
    }
}
