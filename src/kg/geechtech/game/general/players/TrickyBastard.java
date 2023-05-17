package kg.geechtech.game.general.players;

public class TrickyBastard extends Hero {



    public TrickyBastard(int health, int damage) {
        super(health, damage, SuperAbility.PRETENDER);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] hero) {
        for (int i = 0; i < hero.length; i++) {


        }
    }
}
