package TicTacQuest;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Entity player = new EntityBuilder()
                .setName("Zirui")
                .setHealth(100)
                .setAtkDmg(10)
                .setLuck(10)
                .build();

        Entity zombie = new EntityBuilder()
                .setName("Zombie")
                .setHealth(80)
                .setAtkDmg(7)
                .setLuck(3)
                .build();

        Random rand = new Random();

        while (true) {
            boolean chance = (rand.nextInt(100) <= 15);
            if (chance) {
                int atkDmg = rand.nextInt((int) player.attackDmg);
                zombie.attacked(atkDmg);
                System.out.println("You attacked " + zombie.name + " with " + atkDmg + " dmg");
            }

            if (zombie.health <= 0) {
                System.out.println(zombie.name + " is dead");
                break;
            }
        }
    }
}
