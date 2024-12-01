package ucu.edu.apps.flowerstorereboot.Decorator;

import ucu.edu.apps.flowerstorereboot.Item;
import ucu.edu.apps.flowerstorereboot.Flower.FlowerBucket;

public class RibbonDecorator extends AbstractDecorator {
    private Item item;
    public RibbonDecorator(FlowerBucket flowerBucket) {
        item = new FlowerBucket(flowerBucket);
        item.setDescription("Ribbon decorator");
    }

    @Override
    public double price() {
        return item.getPrice();
    }

    @Override
    public String getDescription() {
        return item.getDescription();
    }

    @Override
    public double getPrice() {
        return 40 + item.price();
    }
}
