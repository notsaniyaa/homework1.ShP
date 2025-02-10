import java.util.ArrayList;
import java.util.List;

public class ItemManager {
    private final List<Item> items;

    public ItemManager() {
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void pickUpItems(Player player) {
        for (Item item : new ArrayList<>(items)) {
            player.addItem(item);
            items.remove(item);
        }
    }

    public boolean hasItems() {
        return !items.isEmpty();
    }
}
