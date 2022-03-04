public class funcargs {
  public static void main(String[] args) {
    sum(12,45,87,98,78,87,54);
  }
  static void sum(int ...args){
    int num = 0;
    for (int i = 0; i < args.length; i++) {
      num += args[i];
    }
    System.out.println("The sum is : " + num);
  }
}
