import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by alejandro^ruiz on 5/22/14.
 */
public class AgedBrieTest {

    @Test
    public void testUpdate(){
        AgedBrieUpdater agedBrieUpdater = new AgedBrieUpdater();
        Item item = new Item("Aged Brie", 5, 5);

        agedBrieUpdater.update(item);
        assertEquals(6, item.getQuality());
        assertEquals(4, item.getSellIn());
    }

    @Test
    public void testQualityNeverNegative()
    {
        AgedBrieUpdater agedBrieUpdater = new AgedBrieUpdater();
        Item item = new Item("Aged Brie", 0, 0);

        agedBrieUpdater.update(item);
        assertEquals(1, item.getQuality());
        assertEquals(-1, item.getSellIn());
    }
}
