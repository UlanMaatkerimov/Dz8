package kg.geechtech.game.general.players;

import kg.geechtech.game.general.RPG_Game;

public class Thor extends Hero {
    public Thor(int health, int damage) {
        super(health, damage, SuperAbility.STUN);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] hero) {
        for (int i = 0; i < hero.length; i++) {
            if (boss.getHealth() > 0 && this == hero[i]) {
                boolean stunRand = RPG_Game.random.nextBoolean();
                if (hero[i].getHealth() > 0 && stunRand == true) {
                    boss.setDamage(0);
                    System.out.println("Worked " + this.getClass().getSimpleName()+ " stun");
                    break;
                }
            }
        }
    }
}
