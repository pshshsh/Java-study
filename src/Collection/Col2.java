package Collection;

import java.util.LinkedList;

public class Col2 {
  public static void main(String[] args) {
    //linked list
    // 메모리에 남는 공간을 요청해서 여기 저기 나누어서 실제 값 담아놔요
    // 실제 값이 있는 주소값으로 목록을 구성하고 저장하는 자료구조
    LinkedList<Integer> list = new LinkedList<Integer>();
    list.add(1);
    list.add(2);
    list.add(3);
    System.out.println(list.get(0));
    System.out.println(list.get(1));
    System.out.println(list.get(2));


    list.add(2,4);
    System.out.println(list.toString());
    list.remove(1);
    System.out.println(list.toString());
    list.clear();
    System.out.println(list.toString());

    //기본적 기능은 -> ArrayList와 동일!
    // Linked list는 값 -> 여기 저기 나누어서 : 조회하는 속도가 느리다
    // 값을 추가하거나, 삭제할 떄는 빠르다


  }

}
