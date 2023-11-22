package TicTacQuest;

public class Entity {
    String name;
    double health;
    double attackDmg;

    Entity(String name, double health, double atk) {
        this.name = name;
        this.health = health;
        this.attackDmg = atk;
    }
}
