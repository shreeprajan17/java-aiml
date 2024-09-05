import java.util.Scanner;

public class biodata {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.println("Enter Name: ");
    String name = input.nextLine();

    System.out.println("Enter age: ");
    int age = input.nextInt();

    System.out.println("Enter Department: ");
    String dept = input.next();

    System.out.println("Enter Register Number: ");
    long rno = input.nextLong();

    System.out.println("Enter CGPA: ");
    float cgpa = input.nextFloat();


    System.out.println("\nSTUDENT BIODATA: ");
    System.out.println("Student Name: " + name);
    System.out.println("Student Age: " + age);
    System.out.println("Student Department: " + dept);
    System.out.println("Student Register Number: " + rno);
    System.out.println("Student CGPA: " + cgpa);
  }
}
