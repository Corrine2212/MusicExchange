package Instruments;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PianoTest {
    Piano piano;

    @Before
    public void before(){
        piano = new Piano(1000.00, 10000.00, "Kawai", "Shigeru", "Wood", "Mahogany", "Grand", 88);
    }

    @Test
    public void canGetPianoType(){
        assertEquals("Grand", piano.getType());
    }

    @Test
    public void pianoCanPlaySound(){
        assertEquals("Dun dun dun duuuuuuuun", piano.play());
    }

    @Test
    public void canGetMarkupValue(){
        assertEquals(9000.00, piano.calculateMarkup(), 0.0);
    }
}
