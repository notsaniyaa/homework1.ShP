public class Zombie extends Enemy {
    public Zombie() {
        super("Зомби", 15, 30);
    }

    @Override
    public void attack(Player player) {
        System.out.println(name + " кусает игрока!");
        player.takeDamage(damage);
        player.gainExperience(experienceReward);
    }
}
