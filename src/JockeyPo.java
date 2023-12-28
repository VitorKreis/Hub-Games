import java.util.Random;
import java.util.Scanner;

public class JockeyPo {

    private int choice;

    private int random;
    Scanner sc = new Scanner(System.in);

    private int GenerateRandom(int min, int max) {
        Random rand = new Random();
        return rand.nextInt(max - min) + min;
    }

    public void jockeyPo() {
        System.out.println("Welcome to JockeyPo");
        while (choice != 4) {
            System.out.println("In the game you have to win to the robot");
            random = GenerateRandom(1, 3);
            System.out.println("""
                    1-Pedra
                    2-Papel
                    3-Tesoura
                    4-Go back to Hub
                    Please chose:""");
            choice = sc.nextInt();

            if (choice > 4) {
                System.out.println("You did not choose the information correctly!!");
            } else if (random == 1 && choice == 2) {
                System.out.println("You win congrets");
            } else if (random == 2 && choice == 3) {
                System.out.println("You win congrets");
            } else if (random == 4 && choice == 1) {
                System.out.println("You win congrets");
            } else if (choice == random) {
                System.out.println("You chose the same as the robot, so it's a tie");
            } else {
                System.out.println("You lose!");
            }
        }


    }

}
