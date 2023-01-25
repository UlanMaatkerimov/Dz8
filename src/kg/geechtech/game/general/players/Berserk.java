package kg.geechtech.game.general.players;

public class Berserk extends Hero {



    public Berserk(int health, int damage) {
        super(health, damage, SuperAbility.SAVE_DAMAGE_AND_REVERT);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] hero) {
        for (int i = 0; i < hero.length; i++) {
            if (boss.getHealth() > 0 && this == hero[i]) {
                hero[i].setDamage(boss.getDamage()/5 + hero[i].getDamage());
                System.out.println(this.getClass().getSimpleName() + " used super power " + hero[i].getDamage());
            }
        }
    }
}
