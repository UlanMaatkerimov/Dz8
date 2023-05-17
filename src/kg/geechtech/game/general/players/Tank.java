package kg.geechtech.game.general.players;

public class Tank extends Hero {

    public Tank(int health, int damage) {
        super(health, damage, SuperAbility.SELF_DAMAGE);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] hero) {
        for (int i = 0; i < hero.length; i++) {
            if (hero[i].getHealth() > 0 && this == hero[i]) {
                boss.setDamage(boss.getDamage() + boss.getDamage() / 5);
            }
        }


    }
}
