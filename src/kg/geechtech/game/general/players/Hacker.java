package kg.geechtech.game.general.players;

public class Hacker extends Hero {



    public Hacker(int health, int damage) {
        super(health, damage, SuperAbility.STEAL_HEALTH);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] hero) {
        for (int i = 0; i < hero.length; i++) {


        }
    }
}
