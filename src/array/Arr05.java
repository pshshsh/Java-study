package array;

public class Arr05 {
  public static void main(String[] args) {
    //String = char[]
    //기본형 변수vs 참조형 변수
    //1. 기본형 변수는 '소문자로 시작함' , 참조형 변수는 '대문자시작'
    // -Wrapper class에서 기본형 변수를 감싸줄때는 Integer
    // char보다 String을훨씬 더사용 기능이 너무 많아서..
    // Wrapper class와도 상당히 비슷
    // String 기능
    String str = "ABCD";
    int strLength = str.length();
    System.out.println(strLength);
    //(2) charAt(int index)
    char strChar = str.charAt(1);
    System.out.println(strChar);
    //(3) substring(int fromIdx, int toIdx)
    String strSub = str.substring(0,3);
    System.out.println(strSub);
    //(4) equals(String str)
    String newStr = "ABCD";
    boolean strEquals = str.equals(str);
    System.out.println(strEquals);
    // String -> char[]
    char[] strChars = str.toCharArray();

  }
}
