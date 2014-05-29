import static org.junit.Assert.*;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


public class GildedRoseTest {
/*
Once the sell by date has passed, Quality degrades twice as fast
The Quality of an item is never negative
"Aged Brie" actually increases in Quality the older it gets
The Quality of an item is never more than 50
"Sulfuras", being a legendary item, never has to be sold or decreases in Quality
"Backstage passes", like aged brie, increases in Quality as it's SellIn value
approaches; Quality increases by 2 when there are 10 days or less and by 3 when
there are 5 days or less but Quality drops to 0 after the concert

 */
	@Test
	public void testSellInDegrade() {
        Item gato = new Item("Gato", 1, 10);
        List<Item> items = new ArrayList<Item>();
        items.add(gato);
        GildedRose.updateQuality(items);
        assertEquals(0, gato.getSellIn());
	}

    @Test
    public void testQuality()
    {
        Item gato = new Item("Gato", 1, 10);
        List<Item> items = new ArrayList<Item>();
        items.add(gato);
        GildedRose.updateQuality(items);
        assertEquals(9, gato.getQuality());
    }

    @Test
    public void testSellInNegative()
    {
        Item gato = new Item("Gato", 0, 10);
        List<Item> items = new ArrayList<Item>();
        items.add(gato);
        GildedRose.updateQuality(items);
        assertEquals(-1, gato.getSellIn());
        assertEquals(8, gato.getQuality());
    }

    @Test
    public void testQualityNeverNegative()
    {
        Item gato = new Item("Gato", 1, 0);
        List<Item> items = new ArrayList<Item>();
        items.add(gato);
        GildedRose.updateQuality(items);
        assertEquals(0, gato.getSellIn());
        assertEquals(0, gato.getQuality());
    }

    @Test
    public void testQualityAgedBrie()
    {
        Item agedBrie = new Item("Aged Brie", 1, 0);
        List<Item> items = new ArrayList<Item>();
        items.add(agedBrie);
        GildedRose.updateQuality(items);
        assertEquals(0, agedBrie.getSellIn());
        assertEquals(1, agedBrie.getQuality());
    }

    @Test
    public void testQualityNeverMoreThanFifty()
    {
        Item agedBrie = new Item("Aged Brie", 1, 50);
        List<Item> items = new ArrayList<Item>();
        items.add(agedBrie);
        GildedRose.updateQuality(items);
        assertEquals(0, agedBrie.getSellIn());
        assertEquals(50, agedBrie.getQuality());
    }

    /*"Conjured" items degrade in Quality twice as fast as normal items*/
    @Test
    public void testConjuredItemsQualityDegrade()
    {
        Item backstagePass = new Item("Conjured", 5, 33);
        List<Item> items = new ArrayList<Item>();
        items.add(backstagePass);
        GildedRose.updateQuality(items);
        assertEquals(4, backstagePass.getSellIn());
        assertEquals(31, backstagePass.getQuality());
    }
}
