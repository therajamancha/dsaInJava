import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class TakeArry {
  public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    // creating int array
    int[] arry = new int[5];
    System.out.print("Enter 5 number : ");
    for (int i = 0; i < arry.length; i++) {
        arry[i] = inp.nextInt();
    }
    // printing array method one
    System.out.print("You Entered : ");
    for (int i = 0; i < arry.length; i++) {
      System.out.print(arry[i] + " " );
    }
    // printing array method two
    System.out.println();
    System.out.print("You Entered : ");
    for(int num : arry){
      System.out.print(num + " ");
    }
    // printing array method three
    System.out.println();
    System.out.print("You Entered : ");
    System.out.println(Arrays.toString(arry));

    // creating string array
    String[] str = new String[4];
    System.out.println();
    System.out.println("Enter 4 Name : ");
    for (int i = 0; i < str.length; i++) {
      str[i] = inp.next();
    }
    System.out.println(Arrays.toString(str));
  }
}
