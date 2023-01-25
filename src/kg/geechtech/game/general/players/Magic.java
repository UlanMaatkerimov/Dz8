package kg.geechtech.game.general.players;

public class Magic extends Hero {

    private int magicPoints;


    public Magic(int health, int damage, int magicPoints) {
        super(health, damage, SuperAbility.MAGIC_POWER);

        this.magicPoints = magicPoints;
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] hero) {
        for (int i = 0; i < hero.length; i++) {
            if (hero[i].getHealth() > 0 && boss.getHealth() > 0) {
                hero[i].setDamage(hero[i].getDamage() + magicPoints);
                System.out.println(this.getClass().getSimpleName() + " used magic power " + magicPoints +
                        " " + hero[i].getClass().getSimpleName());
            }
        }
    }
}
