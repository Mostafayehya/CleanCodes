package tdd.marsrover;

import org.junit.Test;
import tdd.marsrover.exceptions.IllegalRoverCommandException;

import static org.junit.jupiter.api.Assertions.*;

public class MarsRoverTest {


    @Test
    public void moveRoverToLeftTest() {
        Rover rover = new Rover(0, 0, "N");
        rover.doCommand("L");
        assertEquals("W", rover.getDirection());
    }

    @Test
    public void moveRoverToRightTest() {
        Rover rover = new Rover(0, 0, "N");
        rover.doCommand("R");
        assertEquals("E", rover.getDirection());

        rover.setDirection("S");
        rover.doCommand("R");
        assertEquals("W", rover.getDirection());

        rover.setDirection("W");
        rover.doCommand("R");
        assertEquals("N", rover.getDirection());

    }

    @Test
    public void moveRoverTest() {
        Rover rover = new Rover(0, 0, "N");
        rover.doCommand("M");
        assertEquals(1, rover.getY());
        assertEquals(0, rover.getX());

        rover.doCommand("M");
        assertEquals(2, rover.getY());
        assertEquals(0, rover.getX());
    }

    @Test
    public void moveRoverAllDirectionsTest() {
        Rover rover = new Rover(0, 0, "E");
        rover.doCommand("M");
        assertEquals(1, rover.getX());
        assertEquals(0, rover.getY());
    }

    @Test
    public void mutliCommandStringTest() {
        Rover rover = new Rover(0, 0, "N");
        rover.doCommand("MM");
        assertEquals(2, rover.getY());
    }

    @Test
    public void marsRoverAcceptanceTest() {
        Rover rover = new Rover(1, 2, "N");
        rover.doCommand("LMLMLMLMM");
        assertEquals(1, rover.getX());
        assertEquals(3, rover.getY());
        assertEquals("N", rover.getDirection());
    }

    @Test
    public void marsRoverAcceptanceTest2() {
        Rover rover = new Rover(3, 3, "E");
        rover.doCommand("MMRMMRMRRM");
        assertEquals(5, rover.getX());
        assertEquals(1, rover.getY());
        assertEquals("E", rover.getDirection());
    }

    @Test
    public void rotateMoveTest() {
        Rover rover = new Rover(1, 2, "N");
        rover.doCommand("LM");
        assertEquals(0, rover.getX());
        assertEquals(2, rover.getY());
        assertEquals("W", rover.getDirection());
    }

    @Test
    public void illegalMoveTest() {
        Rover rover = new Rover(1, 2, "N");
        assertThrows(IllegalRoverCommandException.class,
                () -> rover.doCommand("k")
        );
    }

    @Test
    public void roverWestBoundryTest(){
        Rover rover = new Rover(0, 0, "N",5,5);
        rover.doCommand("LM");
        assertEquals(5, rover.getX());
        assertEquals(0, rover.getY());
    }

    @Test
    public void roverHitEastBoundryTest(){
        Rover rover = new Rover(5, 0, "N",5,5);
        rover.doCommand("RM");
        assertEquals(0, rover.getX());
        assertEquals(0, rover.getY());
    }

    @Test
    public void roverHitNorthBoundryTest(){
        Rover rover = new Rover(0, 5, "N");
        rover.doCommand("M");
        assertEquals(0, rover.getX());
        assertEquals(0, rover.getY());
    }
    @Test
    public void roverHitSouthBoundryTest(){
        Rover rover = new Rover(0, 0, "N");
        rover.doCommand("LLM");
        assertEquals(0, rover.getX());
        assertEquals(5, rover.getY());
    }
}
