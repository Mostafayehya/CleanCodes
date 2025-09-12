package tdd.marsrover;

import tdd.marsrover.exceptions.IllegalRoverCommandExeption;

public class Rover {
    private String direction;
    private int y;
    private int x;

    public Rover(int x, int y, String direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }


    public void setDirection(String direction) {
        this.direction = direction;
    }


    public String getDirection() {
        return direction;
    }

    public void doCommand(String commandLine) {
        final String[] commands = commandLine.split("");

        for(String command : commands) {
            if (command.equals("M")) {
                move();
            } else if (command.equals("L") || command.equals("R")) {
                rotate(command);
            }
            else {
                throw new  IllegalRoverCommandExeption();
            }
        }
    }

    private void move() {
        switch (direction) {
            case "N":
                y++;
                break;
            case "S":
                y--;
                break;
            case "E":
                x++;
                break;
            case "W":
                x--;
                break;
        }
    }

    private void rotate(String command) {
        if (command.equals("L")) {
            switch (direction) {
                case "N":
                    direction = "W";
                    break;
                case "E":
                    direction = "N";
                    break;
                case "S":
                    direction = "E";
                    break;
                case "W":
                    direction = "S";
                    break;
            }
        }

        if (command.equals("R")) {
            switch (direction) {
                case "N":
                    direction = "E";
                    break;
                case "E":
                    direction = "S";
                    break;
                case "S":
                    direction = "W";
                    break;
                case "W":
                    direction = "N";
                    break;
            }
        }
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
