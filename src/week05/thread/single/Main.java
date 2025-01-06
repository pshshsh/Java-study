package week05.thread.single;

public class Main {
  public static void main(String[] args) {
    Runnable task = () -> { //Runnable은 스레드에서 실행할 작업을 정의 할때 사용
      System.out.println("2번 => " + Thread.currentThread().getName());
      for (int i = 0; i < 100; i++) {
        System.out.print("$");
      } // 여기서는 람다 표현식을 사용하여 Runnable 구현
    }; // task라는 이름의 Runnable 객체가 생성

    // 메인 스레드에서 실행
    System.out.println("1번 => " +Thread.currentThread().getName()); // 현재 실행 중인 스레드 이름 반환
    Thread thread1 = new Thread(task); // new Thread(task)로 Runnable 객체 task를 실행하는 새로운 스레드
    thread1.setName("thread1");
  // thread1.setName("thread1")를 호출하여 스레드 이름을 "thread1"로 설정.
    thread1.start(); //스레드가 실행 상태로 전환, Runnable 객체의 run() 메서드 호출
  }
}