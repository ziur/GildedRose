/**
 * Created by alejandro^ruiz on 5/22/14.
 */
public class AgedBrieUpdater {
    public void update(Item item) {
        int quality = item.getQuality() + 1;
        item.setSellIn(item.getSellIn() - 1);
        if(quality <= 50) {
            item.setQuality(quality);
        }
    }
}
