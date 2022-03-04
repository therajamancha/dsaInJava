import java.util.Scanner;

public class Greeting {
  public static void main(String[] args) {
    // greeting();
    Scanner input = new Scanner(System.in);
    System.out.println("Enter Your Name");
    String name = input.nextLine();
    String personlized = greetingMsg(name);
    System.out.println(personlized);
  }
  static String greetingMsg(String greet){
    String msg = "Hello " + greet + " Welcome";
    return msg;
  }

  static void greeting (){
    System.out.println("Hello World");
  }
}
