package tut2;
public class reverceNum {
  public static void main(String[] args) {
    int num = 23597;

    int count = 0;
    while(num > 0){
      int temp = num % 10;
      num /= 10;
      count = count * 10 + temp;
    }
    System.out.println(count);
  }
}
