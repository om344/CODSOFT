import java.util.Scanner;
import java.util.Random;

public class GuessingGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int secretNumber = random.nextInt(100) + 1; // Generate a random number between 1 and 100
        int attempts = 0;
        int maxAttempts = 5;

        System.out.println("Welcome to the Number Guessing Game");
        System.out.println("The Number is between 1 and 100.");

        while (attempts < maxAttempts) {
            System.out.print("Enter your guess (Attempt " + (attempts + 1) + "/" + maxAttempts + "): ");
            int guess = scanner.nextInt();
            attempts++;

            if (guess == secretNumber) {
                System.out.println("Congratulations! You successfully guessed the number.");
                System.out.println("Number of attempts: " + attempts);
                break;
            } else if (guess < secretNumber) {
                System.out.println("Please Enter big number.");
            } else {
                System.out.println("Please Enter lower number.");
            }

        }
             if(attempts == maxAttempts && secretNumber != scanner.nextInt())
{

  System.out.println("Sorry,you've run out of attempts.");
 System.out.println("The number I was thinking of was: " + secretNumber);


}
     scanner.close();
    }
}
