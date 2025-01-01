package Collection;

import java.util.HashSet;
import java.util.Set;

public class Col5 {
  public static void main(String[] args) {
    // Set(집합 : 순서 없고 중복 업음
    // 순서가 보장하지 않는 대신 중복을 허용하지 않도록 한느 프로그램에서 사용할 수 있는 자료구조
    // 생성자가 존재하는 HashSet을 이용해서 set 구현해 볼수있다
    Set<Integer> intSet = new HashSet<>();
    intSet.add(1);
    intSet.add(12);
    intSet.add(13);
    intSet.add(14);
    intSet.add(1);
    for(Integer value : intSet) {
      System.out.println(value);
    }
    //contains
    System.out.println(intSet.contains(1));
    System.out.println(intSet.contains(5));
  }
}
