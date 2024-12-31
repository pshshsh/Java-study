package week02;

public class w07 {
  public static void main(String[] args) {
    //기타 연산자
    // (1) 형변환 연산자
    int intNumber = 93 + (int)98.8;
    System.out.println(intNumber);
    double doubleNumber = (double)93 + 98.8;
    System.out.println(doubleNumber);
    // (2) 삼항연산자
    // 비교 연산자와 함게 쓰임 , ture or false 이결과에 따라 결정되는 무언가
    // 조건 ? 참 : 거짓
    int x = 1;
    int y  = 9;
    boolean b = (x == y) ? true : false;
    System.out.println(b);

    int max = (x > y) ? x : y;
    System.out.println(max);

    int min = (x < y) ? x : y;
    System.out.println(min);
  }
}
