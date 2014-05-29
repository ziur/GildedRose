/**
 * Created by alejandro^ruiz on 5/15/14.
 */

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestUpdater {
    @Test
    public void testUpdate(){
        Item item = new Item("Item", 10, 4);
        Updater updater = new Updater();
        updater.update(item);
        assertEquals(9, item.getSellIn());
        assertEquals(3, item.getQuality());
    }
}
