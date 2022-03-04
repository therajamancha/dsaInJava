import java.util.Scanner;

public class Funpera {
  public static void main(String[] args) {

    int sum = sumFun3(12, 32);
    System.out.println("the Sum = " + sum);

    // calling third function
    Scanner input = new Scanner(System.in);
    System.out.print("Enter Number one: ");
    int x = input.nextInt();
    System.out.print("Enter Number two: ");
    int y = input.nextInt();
    int sum2 = sumFun3(x, y);
    System.out.println("the Sum = "+sum2);

  }
  //  function with paremeter
  static int sumFun3(int a,int b) {
    int sum = a + b;
    return sum;
  } 
}
