import java.util.Scanner;

public class fruit {
  public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    System.out.println("Enter Fruit Name: ");

    String fruit = inp.next();
    switch (fruit) {
      case "Mango":
        System.out.println("King Of Fruit");
        break;
    
      case "Apple":
        System.out.println("A Sweet Red Fruit");
        break;
    
      default:
      System.out.println("Enter Apple or Mango only");
        break;
    }
  }
}
