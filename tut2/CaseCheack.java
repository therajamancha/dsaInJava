package tut2;
import java.util.Scanner;

public class CaseCheack {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter any Charcater");

    char ch = input.next().trim().charAt(0);

    if(ch >= 'a' && ch <= 'z'){
      System.err.println("lowerCase");
    }else{
      System.out.println("UpperCase");
    }
  }
}
