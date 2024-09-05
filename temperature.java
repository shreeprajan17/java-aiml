import java.util.*;

public class temperature{
	public static void main(String[] args){
		Scanner	input = new Scanner(System.in);
		System.out.print("Enter fahrenheit: ");
		float fahrenheit = input.nextFloat();
		float celsius =  (5f/9) * (fahrenheit - 32);
		System.out.println("Celsius: " + celsius);
		
}
}