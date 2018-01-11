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
			int result = guess(r, x);
			if (result == 0) {
				i = 8;
				System.out.println("Congrats, You Win!");
			} else if (result == 1) {
				System.out.println("Your too high! Guess Again");
			} else if (result == 2) {
				System.out.println("Your too low! Guess again");
			}
		}
		System.out.println("Game Over.");
	}

	public static Integer guess(int r, int x) {
		if (r==x) {
			return 0;
		}

		else if (x > r) {
			return 1;
		}

		else if (x < r) {
			return 2;
		}
		return 3;
	}


}