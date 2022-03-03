package tut2;
public class ifElseLader {
  public static void main(String[] args) {
    int salary  = 12000;
    if (salary > 10000) {
      salary += 2000;
    }else if (salary > 20000){
      salary += 3000;
    }else{
      salary += 1000;
    }

    System.err.println(salary);
  }
}