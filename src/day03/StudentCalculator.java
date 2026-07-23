import java.util.Scanner;

public class StudentCalculator {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Your Name: ");
    String name = sc.next();
    System.out.println("Enter your age: ");
    int age = sc.nextInt();
    System.out.println("Enter Maths marks: ");
    int maths = sc.nextInt();
    System.out.println("Enter Chemistry marks: ");
    int chemistry = sc.nextInt();
    System.out.println("Enter Physics marks: ");
    int physics = sc.nextInt();

    System.out.println("===== Student Report =====");
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    int totalMarks = maths + physics + chemistry;
    System.out.println("Total Marks: " + totalMarks);

    int avg = totalMarks / 3;
    System.out.println("Average Marks: " + avg);

  }
}
