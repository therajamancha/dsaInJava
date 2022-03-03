package tut2;
import java.util.Scanner;

public class findMax {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter Three number For max Value");

    int num1 = input.nextInt();
    int num2 = input.nextInt();
    int num3 = input.nextInt();

    // first method
    // int max = num1;
    // if(num2 > max){
    //   max = num2;
    // }
    // if(num3 > num2){
    //   max = num3;
    // }


    // second method
    // int max = 0;
    // if(num1 > num2){
    //   max = num1;
    // }else{
    //   max = num2;
    // }

    // if(num3 > max){
    //   max = num3;
    // }

    // third Method
    int max = Math.max(num1,Math.max(num2,num3));

    System.out.println("Max number is : " + max);
  }
}
