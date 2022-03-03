package tut1;
import java.util.Scanner;

public class oprator {
  public static void main(String[] args) {
    Scanner input  = new Scanner(System.in);
    System.out.println("Enter Number");
    float tempC = input.nextFloat();

    float tempF = (tempC * 9 / 5) + 32;
    System.out.println(tempF);
  }
}
