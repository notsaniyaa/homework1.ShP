public class Skeleton extends Enemy {
    public Skeleton() {
        super("Скелет", 10, 20);
    }

    @Override
    public void attack(Player player) {
        System.out.println(name + " атакует!");
        player.takeDamage(damage);
        player.gainExperience(experienceReward);
    }
}
