public class LevelManager {
    private int level;

    public LevelManager() {
        this.level = 1;
    }

    public void nextLevel(Player player) {
        level++;
        System.out.println(level);
        player.takeDamage(-100); // Полное восстановление здоровья
    }

    public int getLevel() {
        return level;
    }
}
