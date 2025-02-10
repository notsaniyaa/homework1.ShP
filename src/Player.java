import java.util.ArrayList;
import java.util.List;

public class Player {
    private final String name;
    private int health;
    private int experience;
    private final List<Item> inventory;

    public Player(String name) {
        this.name = name;
        this.health = 100;
        this.experience = 0;
        this.inventory = new ArrayList<>();
    }

    public void takeDamage(int damage) {
        health -= damage;
        System.out.println(name + " получил урон: " + damage + ". Осталось здоровья: " + health);
    }

    public void gainExperience(int xp) {
        experience += xp;
        System.out.println(name + " получил опыт: " + xp + ". Текущий опыт: " + experience);
    }

    public void addItem(Item item) {
        inventory.add(item);
        item.applyEffect(this);
        System.out.println(name + " получил предмет: " + item.getName());
    }

    public int getHealth() {
        return health;
    }

}
