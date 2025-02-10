public class GoldCoin extends Item {
    public GoldCoin() {
        super("Золотая монета");
    }

    @Override
    public void applyEffect(Player player) {
        player.gainExperience(5);
        System.out.println("Золотая монета добавлена в инвентарь.");
    }
}
