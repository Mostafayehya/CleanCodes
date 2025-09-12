package tdd.marsrover;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class MarsRoverTest {


    @Test
    public void createSimpleGrid() {
        int[] grid = createGrid(5, 5);
        assertTrue(grid[0] >= 0 && grid[1] >= 0);
    }

    public int[] createGrid(int x, int y) {
        return new int[]{x, y};
    }
}
