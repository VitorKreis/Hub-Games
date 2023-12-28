import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        Adivinha adivinha = new Adivinha();
        JockeyPo jockeyPo = new JockeyPo();
        ZerinhoUm zerinhoUm = new ZerinhoUm();
        System.out.println("Welcome to Hub of the games");

        Thread.sleep(1000);

        while (choice != 4) {
            System.out.print("""
                    Please chose the game you want to play
                    1-Adivenhe o numero;
                    2-JockeyPo;
                    3-Zerinho ou um;
                    4-Sair
                    Your choice:""");
            choice = sc.nextInt();

            if (choice == 1) {
                Thread.sleep(950);
                adivinha.adivinha();
            }

            if (choice == 2) {
                Thread.sleep(950);
                jockeyPo.jockeyPo();
            }

            if (choice == 3) {
                Thread.sleep(950);
                zerinhoUm.zerinhoUm();
            }

            if(choice > 4){
                System.out.println("You did not choose any of the information correctly, please try again");
            }

        }


    }
}