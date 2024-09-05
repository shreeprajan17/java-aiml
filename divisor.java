import java.util.Scanner;

public class divisor{
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		System.out.print("Enter the upper limit: ");
		int n = input.nextInt();
		System.out.print("Enter the divisor: ");
		int d = input.nextInt();

		for (int i = 1; i <= n; i++){
			if (i % d == 0){
				System.out.println("The first number divisible by " + d + " is " + i);
				break;
			}
		}
	}
}