import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListExample {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("ArrayList");
    ArrayList<Integer> list = new ArrayList<>(10);
    list.add(15);
    list.add(21);
    list.add(16);

    System.out.println("This ArrayList contain 65 ? " + list.contains(65));
    System.out.println("ArrayList Inital Value " + list);
    list.set(0, 55);
    list.remove(1);
    System.out.println("ArrayList Updated Value " + list);

    // take 5 elements From User
    System.out.println("Enter 5 number To add in ArrayList : ");

    for (int i = 0; i < 5; i++) {
      list.add(input.nextInt());
    }
    System.out.println("ArrayList Updated Value after You Enterd 5 Value " + list);
  }
}
