package tut2;
public class CountNUms {
  public static void main(String[] args) {
    int n = 454884588;
    int count = 0;
    while(n > 0){
      int rem = n % 10;
      if(rem == 8){
        count++;
      }
      n = n / 10;
    } 
    System.out.println(count);
  }
}
