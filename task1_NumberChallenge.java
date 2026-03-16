import java.util.Scanner;
import java.util.Random;

public class Task1_NumberChallenge {

    public static void main(String[] args) {

        Scanner inputReader = new Scanner(System.in);
        Random randomCreator = new Random();

        int playerScore = 0;
        char continueGame = 'y';

        System.out.println("===== Number Challenge Game =====");

        while (continueGame == 'y' || continueGame == 'Y') {

            int secretValue = randomCreator.nextInt(100) + 1;
            int guessLimit = 6;
            boolean success = false;

            System.out.println("\nA number between 1 and 100 has been generated.");
            System.out.println("You have " + guessLimit + " chances to find it.");

            for (int turn = 1; turn <= guessLimit; turn++) {

                System.out.print("Attempt " + turn + " - Enter your guess: ");
                int playerInput = inputReader.nextInt();

                if (playerInput == secretValue) {
                    System.out.println("Correct! You discovered the number.");
                    playerScore++;
                    success = true;
                    break;
                }

                if (playerInput > secretValue) {
                    System.out.println("Hint: Your guess is greater than the secret number.");
                } else {
                    System.out.println("Hint: Your guess is smaller than the secret number.");
                }
            }

            if (!success) {
                System.out.println("Attempts finished! The correct number was: " + secretValue);
            }

            System.out.println("Current Score: " + playerScore);

            System.out.print("\nDo you want to play another round? (y/n): ");
            continueGame = inputReader.next().charAt(0);
        }

        System.out.println("\nGame ended. Final Score: " + playerScore);
        inputReader.close();
    }
}