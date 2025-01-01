package array;

public class Arr02 {
  public static void main(String[] args) {
    //초기화
    // 1. 배열에 특정값 대입해서 선언
    //int[] intArray = {1, 2, 3, 4, 5};
    String[] stringArray = {"a", "b", "c", "d"};
    // 2. for문을 통해서 대입
//    for(int i=0; i<intArray.length; i++) {
//      intArray[i] = i;
//    }
//    // 다건출력
//    for(int i=0; i<stringArray.length; i++) {
//      System.out.println(intArray[i]);
//    }
    int[] intArray = {10, 20, 30, 40, 50};
    for(int i : intArray) {
      System.out.println(i);
    }
  }
}
