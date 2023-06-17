package Instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {
    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar(100.00, 500.00, "Fender", "Stratocaster", "Wood", "Yellow", "Electric", 6);
    }

    @Test
    public void guitarHasGuitarType(){
        assertEquals("Electric", guitar.getType());
    }

    @Test
    public void guitarCanMakeSound(){
        assertEquals("Struuuummmmmm", guitar.play());
    }

    @Test
    public void canGetMarkupValue(){
        assertEquals(400.00, guitar.calculateMarkup(), 0.0);
    }
}
