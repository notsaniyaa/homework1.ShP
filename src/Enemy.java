public abstract class Enemy {
    protected String name;
    protected int damage;
    protected int experienceReward;

    public Enemy(String name, int damage, int experienceReward) {
        this.name = name;
        this.damage = damage;
        this.experienceReward = experienceReward;
    }

    public abstract void attack(Player player);
}
