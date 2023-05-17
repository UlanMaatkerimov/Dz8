package kg.geechtech.game.general.players;

public class Witcher extends Hero {
    public Witcher(int health, int damage) {
        super(health, damage, SuperAbility.SAVE_LIFE);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] hero) {
        for (int i = 0; i < hero.length; i++) {
            if (hero[i].getHealth() > 0) {
                this.setDamage(0);
                if (hero[i].getHealth() <= 0 && this.getHealth() > 0) {
                    hero[i].setHealth(hero[i].getHealth() + this.getHealth());
                    this.setHealth(0);
                    System.out.println(this.getClass().getSimpleName() + " save a life " +
                            hero[i].getClass().getSimpleName());
                    break;
                }
            }

        }

    }
}
