import java.util.Scanner;

public class sum{
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		System.out.print("Enter a positive integer: ");
		int num = input.nextInt();
		int sum = 0;

		for (int i = 1; i <= num; i++){
			sum += i;
		}

		System.out.println("Sum of first " + num + " natural numbers: " + sum);

	}
}