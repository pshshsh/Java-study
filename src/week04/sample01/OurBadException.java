package week04.sample01;

// 예외 클래스를 만들어서 예외 정의!
public class OurBadException extends Exception {
  public OurBadException() {
    super("위험한 행동을 하면 예외처리를 꼴 해야함!");
  }
}
/* 예외가 발생할 때 전달할 에러 메시지를 생성자에서 정의 */
