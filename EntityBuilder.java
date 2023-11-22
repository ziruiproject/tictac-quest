package TicTacQuest;

public class EntityBuilder {
    String name;
    double health;
    double attackDmg;
    double luck;

    public EntityBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public EntityBuilder setHealth(double health) {
        this.health = health;
        return this;
    }

    public EntityBuilder setAtkDmg(double dmg) {
        this.attackDmg = dmg;
        return this;
    }

    public EntityBuilder setLuck(double luck) {
        this.luck = luck;
        return this;
    }
}
