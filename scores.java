import java.util.Scanner;

public class scores{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		// Get Input
		int[] scores = new int[5]; 
		for (int i = 1; i <= 5; i++){
			int score = input.nextInt();
			scores[i-1] = score;
		}
		// Print Scores
		System.out.print("Scores: ");
		for (int i = 0; i <= 4; i++){
			System.out.print(scores[i] + " ");
		}

		// Find Average
		int sum = 0;
		for (int i = 0; i < 5; i++){
			sum += scores[i];
		}
		System.out.println("\nAverage: " + (float) sum / 5);

		// Find Maximum
		int max = 0;
		for (int i = 0; i < 5; i++){
			if (scores[i] > max){
				max = scores[i];
			}
		}
		System.out.println("Highest Score: " + max);

		//Find Minimum
		int min = max;
		for (int i = 0; i < 5; i++){
			if (scores[i] < min){
				min = scores[i];
			}
		}
		System.out.println("Lowest Score: " + min);
	}
}