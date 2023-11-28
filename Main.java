package TicTacQuest;

import java.util.Random;

public class Main {
    static char board[][] = {
            { ' ', ' ', ' ' },
            { ' ', ' ', ' ' },
            { ' ', ' ', ' ' },
    };

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

        printBoard();

        board[0][1] = 'X';

        printBoard();
    }

    private static void printBoard() {
        System.out.println(board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
        System.out.println("------");
        System.out.println(board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
        System.out.println("------");
        System.out.println(board[2][0] + "|" + board[2][1] + "|" + board[2][2]);
    }
}
