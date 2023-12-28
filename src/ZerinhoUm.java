import java.util.Random;
import java.util.Scanner;

public class ZerinhoUm {

    private int choice;

    private int random;

    private int games = 0;

    Scanner sc = new Scanner(System.in);

    private int GenerateRandom(int min, int max) {
        Random rand = new Random();
        return rand.nextInt(max - min) + min;
    }


    public void zerinhoUm() {

        System.out.println("Welcome to zerinho ou um");
        while (choice != 4){
            System.out.println("In the game you have to guess between 0 and 1");
            random = GenerateRandom(0, 1);
            System.out.print("Zerinho ou um:(Go back to hub:4) ");
            choice = sc.nextInt();
            if(choice > 1 && choice!=4){
                System.out.println("You did not choose the information correctly!!");
            } else if (choice == random) {
                System.out.println("You guess right congrats");
            } else {
                System.out.println("You guess wrong!");
            }
        }



    }

}
