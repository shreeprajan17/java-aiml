import java.util.Scanner;

public class bmi{
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		System.out.print("Weight in kgs: ");
		float kg = input.nextFloat();
		System.out.print("Height in metres: ");
		float metre = input.nextFloat();

		float BMI = kg / (metre * metre);

		if (BMI < 18.5){
			System.out.println("BMI: " + BMI + ", Category: Underweight");
		}
		else if (BMI >= 18.5 && BMI < 24.9){
			System.out.println("BMI: " + BMI + ", Category: Normal Weight");
		}
		else if (BMI >= 25 && BMI < 29.9){
			System.out.println("BMI: " + BMI + ", Category: Overweight");
		}
		else{
			System.out.println("BMI: " + BMI + ", Category: Obesity");
		}
	}
}