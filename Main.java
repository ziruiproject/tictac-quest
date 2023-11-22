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

        Random rand = new Random();

        System.out.println(player);

    }
}
