import java.util.*;

public class Meal {
    List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public float getCost() {
        float cost = 0.0f;
        for (Item item: items) {
            cost += item.price();
        }
        return cost;
    }

    public void showItems () {
        for (Item items: items) {
            System.out.println("Item: " + items.name() + ", Packing: " + items.packing().pack() + ", Price: " + items.price());
        }
    }
}
