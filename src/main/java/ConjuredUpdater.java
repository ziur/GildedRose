/**
 * Created by alejandro^ruiz on 5/22/14.
 */
public class ConjuredUpdater {
    public void update(Item conjuredItem) {
        conjuredItem.setSellIn(conjuredItem.getSellIn() - 1);
        int newQuality = conjuredItem.getQuality() - 2;
        if (newQuality < 0) {
            newQuality = 0;
        }
        conjuredItem.setQuality(newQuality);


    }
}
