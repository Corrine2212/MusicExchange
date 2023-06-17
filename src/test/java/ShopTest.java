import Shop.DrumSticks;
import Shop.GuitarStrings;
import Shop.SheetMusic;
import Shop.Shop;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {
    private GuitarStrings strings;
    private DrumSticks sticks;
    private SheetMusic sheetMusic;
    private Shop shop;

    @Before
    public void before(){
        strings = new GuitarStrings(1.00, 5.00, "Ernie Ball", "Regular Slinky");
        sticks = new DrumSticks(2.00, 10.00, "ProMark", "Maple");
        sheetMusic = new SheetMusic(5.00, 20.00, "When She Loved Me", "Sarah McLachlan");
        shop = new Shop("The Beat Boutique", 50000.00);
    }

    @Test
    public void stringsCanGetMarkupValue(){
        assertEquals(4.00, strings.calculateMarkup(), 0.0);
    }

    @Test
    public void sticksCanGetMarkupValue(){
        assertEquals(8.00, sticks.calculateMarkup(), 0.0);
    }

    @Test
    public void sheetMusicCanGetMarkupValue(){
        assertEquals(15.00, sheetMusic.calculateMarkup(), 0.0);
    }

    @Test
    public void canAddItemsToStock(){
        shop.addItem(strings);
        shop.addItem(sticks);
        shop.addItem(sheetMusic);
        assertEquals(3, shop.getStock().size());
    }

    @Test
    public void canRemoveItemsFromStock(){
        shop.addItem(strings);
        shop.addItem(sticks);
        shop.addItem(sheetMusic);
        shop.removeItem(sheetMusic);
        assertEquals(2, shop.getStock().size());
    }
}
