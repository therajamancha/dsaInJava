import java.util.Scanner;

public class tut1 {
  public static void main(String[] args) {
    // output in java
    System.out.println("Hello World");

    // input in java
    // Scanner input = new Scanner(System.in);
    // System.out.println("Enter Number");
    // int n1 = input.nextInt();
    // System.out.println("You Entered: " + (n1 + 10));

    // Data Types in java
    int a = 1;
    float b = 2.5f;
    char c = 'F';
    double d = 12.232323232d;
    boolean flag1 = false;
    String str1 = "Java Programming";

    // printing method in java
    System.out.println("int " + a);
    a = 21;
    System.out.printf("%d this is a Update of a\n", a);
    System.out.println("Float " + b);
    System.out.println("Char " + c);
    System.out.println("Double " + d);
    System.out.println("Boolean " + flag1);
    System.out.println("Strings " + str1);

    // if condition
    int num1 = 4;
    int num2 = 6;
    if (num1 > num2) {
      System.out.printf("%d is greter then %d\n", num1, num2);
    }

    // if else condition
    if (num2 > num1) {
      System.out.printf("%d is greter then %d\n", num2, num1);
    } else {
      System.out.printf("%d is greter then %d\n", num1, num2);
    }

    // if else if leader
    int num3 = 12;
    if (num3 % 2 == 0) {
      System.out.println("true");
    } else if (num3 % 2 != 0) {
      System.out.println("false");
    } else {
      System.out.println("Enter Valid");
    }

    // switch case
    int day = 7;
    switch (day) {
      case 1:
        System.out.println("Sunday");
        break;
      case 2:
        System.out.println("Monday");
        break;
      case 3:
        System.out.println("Thuesday");
        break;
      case 4:
        System.out.println("Wednesday");
        break;
      case 5:
        System.out.println("Thirsday");
        break;
      case 6:
        System.out.println("Friday");
        break;
      case 7:
        System.out.println("Saturday");
        break;
      default:
        System.out.println("Enter Valid Number");
        break;
    }


    // for loop
    for (int i = 1; i <= 10; i++) {
      System.out.println(i);
    }

    // while loop
    int i = 1;
    while (i <= 10) {
      System.out.println(i);
      if(i == 2){
        // continue;
        break; // break the loop
        // return; // return entire code
      }
      i++;
    }

    // do while loop
    do {
      System.out.println("invalid");
    } while (4 < 3);

    int number[] = {1,2,5,6,4,8,5,12};
    for (int j : number) {
      System.out.println(j);
    }
  }
}