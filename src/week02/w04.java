package week02;

public class w04 {
  // 논리연산자
  // 비교 연산의 결과값으로 받을 수 있는 boolean 값을 연결하는 연산자
  public static void main(String[] args) {
    boolean flag1 = true;
    boolean flag2 = true;
    boolean flag3 = false;
    // (1) 피연산자 중 하나라도 true이면 ture
    System.out.println(flag1 || flag2);
    System.out.println(flag1 || flag2 || flag3);
    // (2) 피 연산자중 모두 true이면 true
    System.out.println(flag1 && flag2);
    System.out.println(flag1 && flag2 && flag3);

  }
}
