package kg.geechtech.game.general.players;

public abstract class GameEntity {

    private int health;
    private int damage;


    public GameEntity(int health, int damage) {
        this.health = health;
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if (health < 0) {
            this.health = 0;
        } else {
            this.health = health;
        }
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        if (health <= 0) {
            this.damage = 0;
        } else {
            this.damage = damage;
        }
    }
}