import java.util.Arrays;
import java.util.Scanner;

public class multiDimention {
  public static void main(String[] args) {
    // int[][] arry = {
    //   {1,2,3},
    //   {4,5,6},
    //   {7,8,9}
    // };
    Scanner input = new Scanner(System.in);

    System.out.println("Enter Row : ");
    int row = input.nextInt();
    System.out.println("Enter Column : ");
    int column = input.nextInt();

    System.out.println("Enter 2D Array values : ");
    int[][] arry = new int[row][column];
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < column; j++) {
        arry[i][j] = input.nextInt();
      }
    }
    System.out.println("Your 2D Array is  : ");
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < column; j++) {
        System.out.print(arry[i][j] + " ");
      }
      System.out.println();
    }
    System.out.println("Your 2D Array in Matrix  : ");
    for (int i = 0; i < row; i++) {
     System.out.println(Arrays.toString(arry[i]));
    }
    // Enhance For loop
    System.out.println("Your 2D Array in Enhance Matrix  : ");
    for (int[] a : arry) {
      System.out.println(Arrays.toString(a));
    }
  }
}
