package tut1;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("Enter Name");
		Scanner input = new Scanner(System.in);
		String name = input.nextLine();
		System.out.println("Welcome To Java : "+ name);
	}
}