import java.util.Random;
import java.util.Scanner;

public class Start {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(1,11);
        System.out.println("Welcome");
        int checkInt;
        System.out.println(randomNumber);

        do {
            System.out.println("Guess generated Number: ");
            checkInt = input.nextInt();
        }while (randomNumber != checkInt);
        System.out.println("Congratulations");
    }
}
