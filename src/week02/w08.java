package week02;

public class w08 {
  public static void main(String[] args) {
    int x = 2;
    int y = 9;
    int z = 10;

    boolean result = x < y && y < z;
    System.out.println(result);

    result = x + 10 < y && y < z;
    System.out.println(result);

    result = x + 2 *3 > y;
    System.out.println(result);
  }
}
