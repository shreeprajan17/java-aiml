import java.util.Scanner;

public class marks{
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		System.out.print("Enter marks: ");
		int marks = input.nextInt();

		if (marks >= 50){
			System.out.println("Pass");
		}
		else{
			System.out.println("Fail");
		}
	}
}