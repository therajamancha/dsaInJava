public class OverLoading {
  public static void main(String[] args) {
    CoolFun(21);
    CoolFun("Raj Amancha");
  }
  static void CoolFun(int a){
    System.out.println(a);
  }
  static void CoolFun(String a){
    System.out.println(a);
  }
}
