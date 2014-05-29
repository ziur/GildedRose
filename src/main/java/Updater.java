/**
 * Created by alejandro^ruiz on 5/15/14.
 */
public class Updater {

    public void update(Item item) {
        item.setSellIn(item.getSellIn() - 1);
        int qualityToDecrease = 1;
        if (item.getQuality() == 0){
            qualityToDecrease = 0;
        }
        else {
            if (item.getSellIn() < 0) {
                qualityToDecrease = 2;
            }
        }
        item.setQuality(item.getQuality() - qualityToDecrease);
    }
}
