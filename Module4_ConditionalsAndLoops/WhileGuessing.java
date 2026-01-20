import java.util.Scanner;
import java.util.Random;

/**
 * Improved guessing game where user can keep guessing until they
 * get the right answer.
 *
 * @author Java Foundations, mvail
 */
public class WhileGuessing {
	public static void main(String[] args) {
		final int MAX = 10;
		int answer, guess;

		Scanner scan = new Scanner(System.in);
		Random generator = new Random();

		answer = generator.nextInt(MAX) + 1;
		guess = -1; // not in valid answer range

		//loop will continue until user's guess matches the answer
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
		scan.close();
	}
}
