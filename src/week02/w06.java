package week02;

public class w06 {
  public static void main(String[] args) {
    // 대입연산자에서 주의해야 할점
    int a = 10;
    int b = 10;
    int val  = ++a + b--;
    System.out.println(val);
    System.out.println(a);
    System.out.println(b);

  }
}
