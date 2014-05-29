import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by alejandro^ruiz on 5/22/14.
 */
public class ConjuredTest {

    @Test
    public void testConjuredUpdate(){
        ConjuredUpdater conjuredUpdater = new ConjuredUpdater();
        Item conjuredItem = new Item("Conjured", 5, 5);

        conjuredUpdater.update(conjuredItem);
        assertEquals(3, conjuredItem.getQuality());
        assertEquals(4, conjuredItem.getSellIn());
    }

    @Test
    public void testQualityNeverNegative()
    {
        ConjuredUpdater conjuredUpdater = new ConjuredUpdater();
        Item conjuredItem = new Item("Conjured", 0, 0);

        conjuredUpdater.update(conjuredItem);
        assertEquals(0, conjuredItem.getQuality());
        assertEquals(-1, conjuredItem.getSellIn());
    }
}
