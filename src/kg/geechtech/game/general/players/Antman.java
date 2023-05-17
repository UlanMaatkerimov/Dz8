package kg.geechtech.game.general.players;

import kg.geechtech.game.general.RPG_Game;

public class Antman extends Hero {


    public Antman(int health, int damage) {
        super(health, damage, SuperAbility.POLIMORPH);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] hero) {
        for (int i = 0; i < hero.length; i++) {
            if (boss.getHealth() > 0) {
                boolean increaseChance = RPG_Game.random.nextBoolean();
                boolean decreaseChance = RPG_Game.random.nextBoolean();
                if (increaseChance == true & this == hero[i]) {
                    this.setDamage(hero[i].getDamage() * 2);
                    this.setHealth(hero[i].getHealth() * 2);
                    System.out.println(this.getClass().getSimpleName() + " increased");
                    break;

                } else if (decreaseChance == true& this == hero[i]) {
                    this.setDamage(hero[i].getDamage() / 2);
                    this.setHealth(hero[i].getHealth() / 2);
                    System.out.println(this.getClass().getSimpleName() + " decreased");
                    break;
                }
            } else {
                hero[i].setDamage(10);
                hero[i].setHealth(150);

            }
        }
    }
}
