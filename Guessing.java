import java.util.Random;
import java.util.Scanner;

class Guessing {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		int r = random.nextInt(1000) + 1;
		// for (int i=0; i < 7; i++) {
		// 	System.out.println("Guess The Number: ");
		// 	int x = scanner.nextInt();
		// 	if (r==x) {
		// 		i = 8;
		// 		System.out.println("Congrats, You Win!");
		// 	} else if (x > r) {
		// 		System.out.println("You're too high! Guess Again.");
		// 	} else if (x < r) {
		// 		System.out.println("You're too low! Guess Again.");
		// 	}
		// }

		int guesses = 1;
		System.out.println("Guess The Number: ");
		int x = scanner.nextInt();

		while (guesses <= 6 && x != r) {
			if (r==x) {
				System.out.println("Congrats, You Win!");
			} else if (x > r) {
				System.out.println("You're too high! Guess Again.");
			} else if (x < r) {
				System.out.println("You're too low! Guess Again.");
			}	
			System.out.println("Guess The Number: ");
			x = scanner.nextInt();
			guesses++;

		}
		if (guesses >= 6) {
			System.out.println("You lose. The number was " + r);
		}
		System.out.println("Game Over.");
	}

}