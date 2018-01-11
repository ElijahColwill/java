import java.util.Random;
import java.util.Scanner;

class Guessing {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		int r = random.nextInt(1000) + 1;
		for (int i=0; i < 7; i++) {
			System.out.println("Guess The Number: ");
			int x = scanner.nextInt();
			if (r==x) {
				i = 8;
				System.out.println("Congrats, You Win!");
			} else if (x > r) {
				System.out.println("Your too high! Guess Again");
			} else if (x < r) {
				System.out.println("Your too low! Guess again");
			}
		}
		System.out.println("Game Over.");
	}

}