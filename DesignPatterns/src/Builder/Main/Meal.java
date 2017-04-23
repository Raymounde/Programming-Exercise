package Builder.Main;

import Builder.Interface.Item;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alfie on 4/21/2017.
 * Meal.java
 */
public class Meal {
    private List<Item> itemList = new ArrayList<>();

    public void addItem(Item item) {
        itemList.add(item);
    }

    public float getCost() {
        float cost = 0;

        for (Item item : itemList) {
            cost += item.price();
        }

        return cost;
    }

    public void showItems() {
        for (Item item : itemList) {
            System.out.println("Item: " + item.name());
            System.out.println("Packing: " + item.packing().pack());
            System.out.println("Price: " + item.price() + "\n");
        }
    }
}
