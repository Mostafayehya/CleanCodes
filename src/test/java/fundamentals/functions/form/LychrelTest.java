package fundamentals.functions.form;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LychrelTest {
    LychrelGenerator lychrelGenerator;

    @Before
    public void setup() {
        lychrelGenerator = new LychrelGenerator();
    }

    @Test
    public void getFirstLychrelNumber() throws Exception {
        assertEquals(196, lychrelGenerator.generateFirstLycheral());
    }

    @Test
    public void getSecondLychrelNumber() throws Exception {
        assertEquals(295, lychrelGenerator.generateSecondLychrel());
    }
}
