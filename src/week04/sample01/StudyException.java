package week04.sample01;

public class StudyException {
  public static void main(String[] args) {
    OurClass ourClass = new OurClass();
    // try ~catch ~ finally 구문
    // 일단 try해 그리고 예외가 발생하면 잡아
    // 그리고, 정상적으로 수행되는, 예외가 발생하든 결국, 마침내 수행햐아 하는 로직을 'finall'로 수행
    try{
      ourClass.thisMethodIsDangerous(); //일단 실행
    } catch(OurBadException e) {
        System.out.println(e.getMessage());
    } finally {
        //무조건 여기는 거쳐요!!
      System.out.println("우리는 방금 예외를 handling 했습니다. 정상처리든, 예외사항 발생하등 여기를 거쳐요");
    }

  }
}
