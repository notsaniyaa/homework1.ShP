public class Game {
    public static void main(String[] args) {
        Player player = new Player("Герой");
        EnemyManager enemyManager = new EnemyManager();
        ItemManager itemManager = new ItemManager();
        LevelManager levelManager = new LevelManager();

        enemyManager.addEnemy(new Skeleton());
        enemyManager.addEnemy(new Zombie());

        itemManager.addItem(new GoldCoin());
        itemManager.addItem(new HealthElixir());

        while (player.getHealth() > 0 && levelManager.getLevel() <= 3) {
            System.out.println(levelManager.getLevel());
            enemyManager.fightEnemies(player);
            itemManager.pickUpItems(player);
            levelManager.nextLevel(player);
        }

        System.out.println("Игра окончена.");
    }
}
