package week04.sample01;

public class OurClass {
  private final boolean just = true;

  // throws : 던지다(=예외를 던지다/ 발생시키다)!!
  public void thisMethodIsDangerous() throws OurBadException{
    //custom logic~!
    if(just) {
      throw new OurBadException();
    }
  }
}
/* just가 true일때 예외던지도록 설계
throw new OurBadException();는 OurBadException을
발생시키는 명령입니다
throws 키워드는 이 메서드가 예외를 발생시킬
가능성이 있다는 것을 호출자에게 알립니다.
throw가 호출되면, 프로그램 실행 흐름이 즉시 중단되고,
 예외를 처리할 코드(try-catch)로 이동합니다.
 */