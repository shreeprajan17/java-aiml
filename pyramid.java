import java.util.Scanner;

public class pyramid {
	public static void main(String[] args) {

			Scanner input = new Scanner(System.in);
			System.out.print("Enter number of levels of pyramid: ");
			int rows = input.nextInt();

			for (int i = 1; i <= rows; i++) {
					// Printing spaces
					for (int j = rows; j > i; j--) {
							System.out.print(" ");
					}
					// Printing stars
					for (int k = 1; k <= (2 * i - 1); k++) {
							System.out.print("*");
					}
					System.out.println();
			}
	}
}