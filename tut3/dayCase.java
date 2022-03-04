import java.util.Scanner;

public class dayCase {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter Day");

    int day = input.nextInt();
    switch (day) {
      case 1 -> System.out.println("Sunday");
      case 2 -> System.out.println("Monday");
      case 3 -> System.out.println("Tuesday");
      case 4 -> System.out.println("Wednesday");
      case 5 -> System.out.println("Thursday");
      case 6 -> System.out.println("Friday");
      case 7 -> System.out.println("Saturday");
      default -> System.out.println("Enter 1 to 7 only");
    }

    switch (day){
      case 2,3,4,5,6,7 -> System.out.println("weekday");
      case 1 -> System.out.println("Weekend");
      default -> System.out.println("Enter 1 to 7 only");
    }
  }
}
