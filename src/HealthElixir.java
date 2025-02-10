public class HealthElixir extends Item {
    public HealthElixir() {
        super("Эликсир здоровья");
    }

    @Override
    public void applyEffect(Player player) {
        System.out.println("Игрок восстанавливает 20 здоровья.");
    }
}
