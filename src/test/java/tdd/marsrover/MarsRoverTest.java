package tdd.marsrover;

import org.junit.Before;
import org.junit.Test;
import tdd.marsrover.exceptions.IllegalRoverCommandException;

import static org.junit.jupiter.api.Assertions.*;

public class MarsRoverTest {

    Grid fiveByFiveGrid;
    Position zeroPosition;

    @Before
    public void setUp() {
        fiveByFiveGrid = new Grid(5, 5);
        zeroPosition = new Position(0, 0, fiveByFiveGrid);
    }

    @Test
    public void moveRoverToLeftTest() {
        Rover rover = new Rover(zeroPosition, Direction.NORTH);
        rover.doCommand("L");
        assertEquals(Direction.WEST, rover.getDirection());
    }

    @Test
    public void moveRoverToRightTest() {
        Rover rover = new Rover(zeroPosition, Direction.NORTH);
        rover.doCommand("R");
        assertEquals(Direction.EAST, rover.getDirection());

        rover.setDirection(Direction.SOUTH);
        rover.doCommand("R");
        assertEquals(Direction.WEST, rover.getDirection());

        rover.setDirection(Direction.WEST);
        rover.doCommand("R");
        assertEquals(Direction.NORTH, rover.getDirection());

    }

    @Test
    public void moveRoverTest() {
        Rover rover = new Rover(zeroPosition, Direction.NORTH);
        rover.doCommand("M");
        assertEquals(1, rover.getPosition().getY());
        assertEquals(0, rover.getPosition().getX());

        rover.doCommand("M");
        assertEquals(2, rover.getPosition().getY());
        assertEquals(0, rover.getPosition().getX());
    }

    @Test
    public void moveRoverAllDirectionsTest() {
        Rover rover = new Rover(zeroPosition, Direction.EAST);
        rover.doCommand("M");
        assertEquals(1, rover.getPosition().getX());
        assertEquals(0, rover.getPosition().getY());
    }

    @Test
    public void mutliCommandStringTest() {
        Rover rover = new Rover(zeroPosition, Direction.NORTH);
        rover.doCommand("MM");
        assertEquals(2, rover.getPosition().getY());
    }

    @Test
    public void marsRoverAcceptanceTest() {
        Rover rover = new Rover(new Position(1, 2, fiveByFiveGrid), Direction.NORTH);
        rover.doCommand("LMLMLMLMM");
        assertEquals(1, rover.getPosition().getX());
        assertEquals(3, rover.getPosition().getY());
        assertEquals(Direction.NORTH, rover.getDirection());
    }

    @Test
    public void marsRoverAcceptanceTest2() {
        Rover rover = new Rover(new Position(3, 3, fiveByFiveGrid), Direction.EAST);
        rover.doCommand("MMRMMRMRRM");
        assertEquals(5, rover.getPosition().getX());
        assertEquals(1, rover.getPosition().getY());
        assertEquals(Direction.EAST, rover.getDirection());
    }

    @Test
    public void rotateMoveTest() {
        Rover rover = new Rover(new Position(1, 2, fiveByFiveGrid), Direction.NORTH);
        rover.doCommand("LM");
        assertEquals(0, rover.getPosition().getX());
        assertEquals(2, rover.getPosition().getY());
        assertEquals(Direction.WEST, rover.getDirection());
    }

    @Test
    public void illegalMoveTest() {
        Rover rover = new Rover(new Position(1, 2, fiveByFiveGrid), Direction.NORTH);
        assertThrows(IllegalRoverCommandException.class,
                () -> rover.doCommand("k")
        );
    }

    @Test
    public void roverWestBoundryTest() {
        Rover rover = new Rover(zeroPosition, Direction.NORTH);
        rover.doCommand("LM");
        assertEquals(5, rover.getPosition().getX());
        assertEquals(0, rover.getPosition().getY());
    }

    @Test
    public void roverHitEastBoundryTest() {
        Rover rover = new Rover(new Position(5, 0, fiveByFiveGrid), Direction.NORTH);
        rover.doCommand("RM");
        assertEquals(0, rover.getPosition().getX());
        assertEquals(0, rover.getPosition().getY());
    }

    @Test
    public void roverHitNorthBoundryTest() {
        Rover rover = new Rover(new Position(0, 5, fiveByFiveGrid), Direction.NORTH);
        rover.doCommand("M");
        assertEquals(0, rover.getPosition().getX());
        assertEquals(0, rover.getPosition().getY());
    }

    @Test
    public void roverHitSouthBoundryTest() {
        Rover rover = new Rover(zeroPosition, Direction.NORTH);
        rover.doCommand("LLM");
        assertEquals(0, rover.getPosition().getX());
        assertEquals(5, rover.getPosition().getY());
    }

    @Test
    public void shouldTurnLeftFromNorth() {
        Direction direction = Direction.NORTH;
        assertEquals(Direction.WEST, direction.turnLeft());
    }

    @Test
    public void shouldTurnLeftFromWest() {
        Direction direction = Direction.WEST;
        assertEquals(Direction.SOUTH, direction.turnLeft());
    }

    @Test
    public void shouldTurnLeftFromSouth() {
        Direction direction = Direction.SOUTH;
        assertEquals(Direction.EAST, direction.turnLeft());
    }

    @Test
    public void shouldTurnLeftFromEast() {
        Direction direction = Direction.EAST;
        assertEquals(Direction.NORTH, direction.turnLeft());
    }

    @Test
    public void shouldTurnRightFromNorth() {
        Direction direction = Direction.NORTH;
        assertEquals(Direction.EAST, direction.turnRight());
    }

    @Test
    public void shouldTurnRightFromEast() {
        Direction direction = Direction.EAST;
        assertEquals(Direction.SOUTH, direction.turnRight());
    }

    @Test
    public void shouldTurnRightFromSouth() {
        Direction direction = Direction.SOUTH;
        assertEquals(Direction.WEST, direction.turnRight());
    }

    @Test
    public void shouldTurnRightFromWest() {
        Direction direction = Direction.WEST;
        assertEquals(Direction.NORTH, direction.turnRight());
    }

    // =========== Positioning ==========
    @Test
    public void moveInPositionTest() {
        Position position = new Position(0, 0);

        position.moveNorth();
        assertEquals(0, position.getX());
        assertEquals(1, position.getY());
    }

    @Test
    public void movePositionSouthTest() {
        Position position = new Position(1, 1);

        position.moveSouth();

        assertEquals(1, position.getX());
        assertEquals(0, position.getY());
    }

    @Test
    public void movePositionEastTest() {
        Position position = new Position(5, 5);

        position.moveEast();

        assertEquals(0, position.getX());
        assertEquals(5, position.getY());
    }

    @Test
    public void movePositionWestTest() {
        Position position = new Position(5, 5);

        position.moveWest();

        assertEquals(4, position.getX());
        assertEquals(5, position.getY());
    }

}
