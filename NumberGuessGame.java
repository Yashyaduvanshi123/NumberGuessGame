import java.util.Random;
import java.util.Scanner;

public class NumberGuessGame {
    public static void main (String args []) {
        Scanner sc = new Scanner(System.in);
        int maxAttempts = 3;
        Random rand = new Random();
        int RandomNumber = rand.nextInt(100) + 1;
        System.out.println("🎯 Guess the number between 1 and 100:");
        System.out.println("You have only " + maxAttempts + " attempts!");
        int userguess = 0;
        int attempt = 0;


        while (userguess != RandomNumber && attempt < maxAttempts) {
            System.out.println("Guess the Number: ");
            userguess = sc.nextInt();
            attempt++;

            if (userguess < RandomNumber) {
                System.out.println("To Low");
            } else if (userguess <= RandomNumber) {
                System.out.println("To Close");
            } else {
                System.out.println("Correct ! You Guessed in it " +  attempt  + " attempt only");
                break;
            }
            if (attempt == maxAttempts && userguess != RandomNumber) {
                System.out.println("Game Over 😢 You've used all " + maxAttempts + " attempts.");
                System.out.println("The correct number was: " +RandomNumber);
            }
        }
        sc.close();


    }

}
