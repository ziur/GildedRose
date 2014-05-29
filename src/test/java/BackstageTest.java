import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by alejandro^ruiz on 5/22/14.
 */
public class BackstageTest {

    @Test
    public void testBackstagePassesQualityIncreasesByTwoWhenTenDaysOrLess()
    {
        BackstageUpdater backstageUpdater = new BackstageUpdater();
        Item backstagePass = new Item("Backstage passes to a TAFKAL80ETC concert", 10, 33);
        backstageUpdater.update(backstagePass);
        assertEquals(9, backstagePass.getSellIn());
        assertEquals(35, backstagePass.getQuality());
    }

    @Test
    public void testBackstagePassesQualityIncreasesByThreeWhenFiveDaysOrLess()
    {
        BackstageUpdater backstageUpdater = new BackstageUpdater();
        Item backstagePass = new Item("Backstage passes to a TAFKAL80ETC concert", 5, 33);
        backstageUpdater.update(backstagePass);
        assertEquals(4, backstagePass.getSellIn());
        assertEquals(36, backstagePass.getQuality());
    }

    @Test
    public void testBackstagePassesQualityDropsZero()
    {
        BackstageUpdater backstageUpdater = new BackstageUpdater();
        Item backstagePass = new Item("Backstage passes to a TAFKAL80ETC concert", 0, 33);
        backstageUpdater.update(backstagePass);
        assertEquals(-1, backstagePass.getSellIn());
        assertEquals(0, backstagePass.getQuality());
    }
}
