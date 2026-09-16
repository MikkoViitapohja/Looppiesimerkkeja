import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        // Tulostaa 5 kertaa HAMK

        // System.out.println("HAMK");

        // int kierrosluku = 0;

        // while (kierrosluku < 5)

        // {
        //     System.out.println("HAMK");
        //     kierrosluku = kierrosluku +1; // kierrosluku kasvaa yhdellä
        // }

        //Print numbers from 1 to 5

        // System.out.println("1");
        // System.out.println("2");
        // System.out.println("3");
        // System.out.println("4");
        // System.out.println("5");

        // for (reset counter; condition; increment)

        // for (int counter = 0 ; counter < 5; counter++)
        // {
        //     System.out.println(counter + 1);
        // }

        // WHILE
        // int counter = 0;
        // while (counter < 5) {
        //     System.out.println(counter + 1);
        //     counter++;
        // }

        // DO WHILE
        
        // Random r = new Random();
        // Scanner in = new Scanner(System.in);
        // String playAgain;

        // do {
        //     System.out.println("Trowing a dice");
        //     System.out.println(r.nextInt(6)+1);
        //     System.out.println("Again (Y/N)?");
        //     playAgain = in.nextLine();
        // } while (playAgain.equalsIgnoreCase("Y"));

        // System.out.println("Thanks for playing!");

        for (int i = 0; i < 100 ; i++)
        {
            if (i == 50) {
                break;
            }
            System.out.println(i + 1);
        }
    }
}
