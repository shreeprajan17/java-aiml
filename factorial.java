import java.util.Scanner;

public class factorial{
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		System.out.print("Enter a non-negative integer: ");
		int num = input.nextInt();

		int val = 1;

		for (int i = 1; i <= num; i++){
			val *= i;
		}

		System.out.println("Factorial of " + num + " is " + val);

	}
}