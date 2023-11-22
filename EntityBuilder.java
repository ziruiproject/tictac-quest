package TicTacQuest;

public class EntityBuilder {

    private Entity entity = new Entity();

    public EntityBuilder setName(String name) {
        entity.name = name;
        return this;
    }

    public EntityBuilder setHealth(double health) {
        entity.health = health;
        return this;
    }

    public EntityBuilder setAtkDmg(double dmg) {
        entity.attackDmg = dmg;
        return this;
    }

    public EntityBuilder setLuck(double luck) {
        entity.luck = luck;
        return this;
    }

    public Entity build() {
        return entity;
    }

}
