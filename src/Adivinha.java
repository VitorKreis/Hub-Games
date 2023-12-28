import java.util.Random;
import java.util.Scanner;

public class Adivinha{

    private int life = 0;

    private int choice;

    private int random;
    Scanner sc = new Scanner(System.in);

    private int GenerateRandom(int min,  int max){
        Random rand = new Random();
        return rand.nextInt(max - min) + min;
    }

    public void adivinha() throws InterruptedException {
        System.out.println("Welcome to Adivinha!");
        System.out.println("In the game you have three chances to guess the number");
        Thread.sleep(1000);
        random = GenerateRandom(0, 10);
        for (life = 3; life >= 1; life--) {
            System.out.println("Life: " + life);
            System.out.println("I'm thinking about numbers from 0 to 10, can you guess that the desired number is: ");
            choice = sc.nextInt();
            Thread.sleep(1000);
            if(choice > 10){
                life=0;
                System.out.println("You did not choose the information correctly!!");
            } else if(choice == random){
                System.out.println("UAU you really got right the number");
                life=0;
            } else {
                System.out.println("I'm sorry but no thats not the number");
            }


        }

    }


}
