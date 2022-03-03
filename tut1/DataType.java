package tut1;
public class DataType {
  public static void main(String[] args) {
    // number 
    int num1 = 231;
    byte num2 = 127;
    short num3 = 100;
    long num4 = 23232132132132l;

    float f1 = 1.32f;
    double d1 = 121313.154654654564d;

    String name = "Raj";
    char ch1 = 'A';
    System.out.println(num1);
    System.out.println(num2);
    System.out.println(num3);
    System.out.println(num4);
    System.out.println(d1);
    System.out.println(name);
    System.out.println(ch1);
    // type casting
    System.out.println((int)f1);
    // auto type convertion
    System.out.println(3 * 2323.6465454f);
  }
}
