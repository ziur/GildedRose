import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by alejandro^ruiz on 5/22/14.
 */
public class SulfurasTest {

    //"Sulfuras", being a legendary item, never has to be sold or decreases in Quality
    @Test
    public void testQualitySulfuras()
    {
        SulfurasUpdater sulfurasUpdater = new SulfurasUpdater();
        Item sulfuras = new Item("Sulfuras, Hand of Ragnaros", 10, 33);
        sulfurasUpdater.update(sulfuras);
        assertEquals(10, sulfuras.getSellIn());
        assertEquals(80, sulfuras.getQuality());
    }

}
