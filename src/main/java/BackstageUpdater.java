/**
 * Created by alejandro^ruiz on 5/29/14.
 */
public class BackstageUpdater {
    /*
    "Backstage passes", like aged brie, increases in Quality as it's SellIn value
    approaches; Quality increases by 2 when there are 10 days or less and by 3 when
    there are 5 days or less but Quality drops to 0 after the concert
    */
    public void update(Item backstagePass) {
        int sellin = backstagePass.getSellIn() - 1;
        backstagePass.setSellIn(sellin);
        int quality = backstagePass.getQuality();
        if (sellin <= 0) {
            quality = 0;
        }
        else if (sellin <= 5) {
            quality += 3;
        }
        else if (sellin <= 10){
            quality += 2;
        }
        else{
            quality++;
        }
        backstagePass.setQuality(quality);
    }
}
