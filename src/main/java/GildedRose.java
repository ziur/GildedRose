import java.util.ArrayList;
import java.util.List;


public class GildedRose {

    /**
     * @param args
     */
    public static void main(String[] args) {

        System.out.println("OMGHAI!");

        ArrayList<Item> items = new ArrayList<Item>();
        items.add(new Item("+5 Dexterity Vest", 10, 20));
        items.add(new Item("Aged Brie", 2, 0));
        items.add(new Item("Elixir of the Mongoose", 5, 7));
        items.add(new Item("Sulfuras, Hand of Ragnaros", 0, 80));
        items.add(new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20));
        items.add(new Item("Conjured Mana Cake", 3, 6));
        print(items);
        updateQuality(items);
        print(items);
    }

    public static void print(List<Item> items) {
        System.out.println("Items:");
        for (Item item : items) {
            System.out.println(item);
        }
    }


    public static void updateQuality(List<Item> items) {
        Updater updater = new Updater();
        ConjuredUpdater conjuredUpdater = new ConjuredUpdater();
        AgedBrieUpdater agedBrieUpdater = new AgedBrieUpdater();
        SulfurasUpdater sulfurasUpdater = new SulfurasUpdater();
        BackstageUpdater backstageUpdater = new BackstageUpdater();
        ArrayList<String> specialItems = new ArrayList<String>();
        specialItems.add("Conjured");
        specialItems.add("Aged Brie");
        specialItems.add("Sulfuras, Hand of Ragnaros");
        specialItems.add("Backstage passes to a TAFKAL80ETC concert");
        String name;
        for (int i = 0; i < items.size(); i++) {
            name = items.get(i).getName();
            if (!specialItems.contains(name)) {
                updater.update(items.get(i));
            }

            if ("Conjured".equals(items.get(i).getName())) {
                conjuredUpdater.update(items.get(i));
            }
            if ("Aged Brie".equals(name)) {
                agedBrieUpdater.update(items.get(i));
            }

            if ("Sulfuras, Hand of Ragnaros".equals(name)) {
                sulfurasUpdater.update(items.get(i));
            }

            if ("Backstage passes to a TAFKAL80ETC concert".equals(name)) {
                backstageUpdater.update(items.get(i));
            }
        }
    }

}