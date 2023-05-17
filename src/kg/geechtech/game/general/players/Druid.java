package kg.geechtech.game.general.players;

public class Druid extends Hero {



    public Druid(int health, int damage) {
        super(health, damage, SuperAbility.CALL_AN_ASSISTANT);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] hero) {
        for (int i = 0; i < hero.length; i++) {
            
        }
    }
}
