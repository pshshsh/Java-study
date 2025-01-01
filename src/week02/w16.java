package week02;

public class w16 {
  public static void main(String[] args) {
//    int number = 0;
//    while (number < 3) { // number < 3 인 동안
//      number++;
//      System.out.println(number + "출력");
//      }
//     }
//   }
    // do ~ while 어떤 작업을 먼저하고 와일문을 돌리겠다
//    int number = 4;
//    do {
//      //이 로직을 먼저 수행하겠다!!
//      System.out.println(number + "출력!");
//    }while (number < 5);

    //break(깨부수다)가장 가까운 블록의 for 문 또는 while,switch문을 중단!
    int number = 0;
    while (number < 3) {
      number++;
      if(number ==2){
        break;
      }
      System.out.println(number + "출력!");
    }
  }
}