import java.util.ArrayList;
import java.util.List;

public class EnemyManager {
    private final List<Enemy> enemies;

    public EnemyManager() {
        this.enemies = new ArrayList<>();
    }

    public void addEnemy(Enemy enemy) {
        enemies.add(enemy);
    }

    public void fightEnemies(Player player) {
        for (Enemy enemy : new ArrayList<>(enemies)) {
            enemy.attack(player);
            enemies.remove(enemy);
        }
    }

    public boolean hasEnemies() {
        return !enemies.isEmpty();
    }
}
