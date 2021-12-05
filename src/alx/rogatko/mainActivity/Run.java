package alx.rogatko.mainActivity;

import java.util.Scanner;

public class Run {
    public static void run() {
        Field player1Field = new Field();
        player1Field.initial();
        Field player2Field = new Field();
        player2Field.initial();
        Scanner sc = new Scanner(System.in);
        System.out.println("Change type of game");
        System.out.println("1 - AI vz Player");
        System.out.println("2 - AI vz Ai");
        System.out.println("3 - Player vz Player");
        int set = sc.nextInt();





    }
}

