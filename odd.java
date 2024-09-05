import java.util.Scanner;

public class odd{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a positive integer: ");
		int n = input.nextInt();
		System.out.println("Odd numbers from 1 to " + n + ":");
		for (int i = 1; i <= n; i++){
			if (i % 2 == 0){
				continue;
			}
			System.out.print(i + " ");
		}
	}
}