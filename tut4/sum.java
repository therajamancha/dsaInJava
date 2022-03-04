import java.util.Scanner;

public class sum {
  public static void main(String[] args) {
    // calling first metho
    sumFun();
    // calling second method
    int sum = sumFun2();
    System.out.println("Sum Of Two Number : " + sum);
  }
  // simple function
  static void sumFun() {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter Number one: ");
    int a = input.nextInt();
    System.out.print("Enter Number two: ");
    int b = input.nextInt();
    int sum = a + b;
    System.out.println("Sum Of Two Number : " + sum);
  }
  // function with return type
  static int sumFun2() {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter Number one: ");
    int a = input.nextInt();
    System.out.print("Enter Number two: ");
    int b = input.nextInt();
    int sum = a + b;
    return sum;
  }
}