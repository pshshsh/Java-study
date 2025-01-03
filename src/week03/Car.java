package week03;
// 만들려고 하는 설계도 선언(클래스 선언)
// 객체가 가지고 있어야 할 속성(필드)를 정의
// 객체를 생성하는 형식을 정의(생성자)
//    -constructor
// 객체가 가지고 있어야할 행위(메서드) 정의
public class Car {
  //필드영역
  //고유 데이터 부분
  String company;
  String model = "Gv80";
  String color;
  double price;
  //상태 데이터 부분
  double speed;
  char gear; //기어상태(P,R,N,D)
  boolean lights = true; //조명상태
  //객체 데이터 부분
  Tire tire = new Tire();
  Door door;
  Handle handle;

  //생성자 : 처음 객체가 생성될때 어떤 로직을 수행해야하며, 어떤 값이 필수로들어와야 하는지 정의
  public Car() {
    System.out.println("객체가 생성됩니다");
  }

  // 메서드 영역
  double gasPedal(double kmh, char type) {
    changeGear(type); //가속도 페달을 밟으면 자동으로 기어변함
    speed = kmh;
    return speed;
  }

  double breakPedal() {
    speed = 0;
    return speed;
  }

  char changeGear(char type) {
    gear = type;
    return gear;
  }

  boolean onOffLights() {
    lights = !lights;
    return lights;
  }

  void horn() {
    System.out.println("빵빵!");


  }

  //자동차의 속도 .. 가변길이 메서드
  void carSpeeds(double... speeds) {
    for (double v : speeds) {
      System.out.println("v = " + v);
    }


  }
}