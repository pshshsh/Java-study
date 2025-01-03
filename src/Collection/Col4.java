package Collection;

import java.util.LinkedList;
import java.util.Queue;

public class Col4 {
  public static void main(String[] args) {
    // Queue : FIFO 빨대생각
    // add, peek, poll
    // Queue : 생성자가 없는 인터페이스

    Queue<Integer> intQueue = new LinkedList<>(); // 생성자가 없어서
    intQueue.add(1);
    intQueue.add(5);
    intQueue.add(9);
    while (!intQueue.isEmpty()) {
      System.out.println(intQueue.poll());
    }
    // 다시추가
    intQueue.add(1);
    intQueue.add(5);
    intQueue.add(9);
    intQueue.add(10);
    //peak
    System.out.println(intQueue.peek());
    System.out.println(intQueue.size());
  }
}
