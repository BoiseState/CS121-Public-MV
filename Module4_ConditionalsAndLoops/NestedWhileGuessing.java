import java.util.Scanner;
import java.util.Random;

/**
 * Even more improved guessing game where user can keep guessing
 * until they get the right answer and they can play as many
 * games as they want.
 *
 * @author Java Foundations, mvail
 */
public class NestedWhileGuessing {
	public static void main(String[] args) {
		final int MAX = 10;
		int answer, guess;
		String playAgain = "Y";

		Scanner scan = new Scanner(System.in);
		Random generator = new Random();

		// loop continues until user says they don't want to play again
		while (playAgain.compareToIgnoreCase("Y") == 0) {
			// get a new random answer
			answer = generator.nextInt(MAX) + 1;
			guess = -1; // not in valid answer range

			// game loop will continue until guess matches the answer
			while (answer != guess) {
				System.out.print("I'm thinking of a number between 1 and "
						+ MAX + ". Guess what it is: ");
				guess = Integer.parseInt(scan.nextLine().strip());

				if (guess == answer) {
					System.out.println("You got it! Good guessing!");
				} else if (guess < answer) {
					System.out.println("Too low. Try again.");
				} else {
					System.out.println("Too high. Try again.");
				}
			}

			// ask if user wants to play again
			System.out.print("Do you want to play another game (Y/N)? ");
			playAgain = scan.nextLine().strip().toUpperCase(); // accepts "Y" or "y"
		}
		scan.close();
	}
}
