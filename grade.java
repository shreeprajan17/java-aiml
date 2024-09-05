import java.util.Scanner;

public class grade{
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		System.out.print("Enter marks: ");

		int marks = input.nextInt();

		if (marks >= 81){
			System.out.println("Grade: A");
		}
		else if (marks >= 61 && marks <= 80){
			System.out.println("Grade: B");
		}
		else if (marks >= 41 && marks <= 60){
			System.out.println("Grade: C");
		}
		else{
			System.out.println("Grade: Fail");
		}
	}
}