package tdd.marsrover;

import tdd.marsrover.exceptions.IllegalRoverCommandException;

public class Rover {
    private Direction direction;
    private Position position;

    public Rover(Position position, Direction direction) {
        this.position = position;
        this.direction = direction;
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
                position.moveNorth();
                break;
            case SOUTH:
                position.moveSouth();
                break;
            case EAST:
                position.moveEast();
                break;
            case WEST:
                position.moveWest();
                break;
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

    public Position getPosition() {
        return position;
    }
}
