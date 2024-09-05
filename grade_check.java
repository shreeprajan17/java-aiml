import java.util.Scanner;

public class grade_check{
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		System.out.print("Enter marks: ");
		int marks = input.nextInt();

		if (marks >= 90){
			System.out.println("A");
		}
		else if (marks >= 80 && marks < 90){
			System.out.println("B");
		}
		else if (marks >= 70 && marks < 80){
			System.out.println("C");
		}
		else if (marks >= 60 && marks < 70){
			System.out.println("D");
		}
		else if (marks < 60){
			System.out.println("FAIL");
		}
	}
}