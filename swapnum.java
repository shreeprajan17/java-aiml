import java.util.Scanner;

public class swapnum{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.print("Enter a: ");
    int a = input.nextInt();
    System.out.print("Enter b: ");
    int b = input.nextInt();

    System.out.println("Originally, a = " + a + " b = " + b);

    a = a + b;
    b = a - b;
    a = a - b;

    System.out.println("After Swapping, a = " + a + " b = " + b);
  }
}