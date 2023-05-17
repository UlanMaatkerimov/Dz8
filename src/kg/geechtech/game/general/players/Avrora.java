package kg.geechtech.game.general.players;

public class Avrora extends Hero {



    public Avrora(int health, int damage) {
        super(health, damage, SuperAbility.INVISIBLE);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] hero) {
        for (int i = 0; i < hero.length; i++) {

        }
    }
}
