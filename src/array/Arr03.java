package array;

public class Arr03 {
  public static void main(String[] args) {
    int[] a = {1, 2, 3, 4};// 얕은 복사
   int[] b = a;
   b[0] = 3;
   System.out.println(a[0]);

  }
}
