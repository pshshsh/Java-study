package week02;

import java.util.Objects;
import java.util.Scanner;

public class w13 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("A 입력 : ");
    String aHand = sc.nextLine();

    System.out.println("B 입력 : ");
    String bHand = sc.nextLine();

    // 두 개의 값을 비교하는 메서드
    if (Objects.equals(aHand, "가위")) {
      if (Objects.equals(bHand, "가위")) {
        System.out.println("A와 B는 비겼습니다.");
      } else if (Objects.equals(bHand, "바위")) {
        System.out.println("B가 이겼습니다.");
      } else if (Objects.equals(bHand, "보")) {
        System.out.println("A가 이겼습니다.");
      } else {
        System.out.println("B가 이상한 값을 입력했습니다.");
      }
    } else if (Objects.equals(aHand, "바위")) {
      if (Objects.equals(bHand, "가위")) {
        System.out.println("A가 이겼습니다.");
      } else if (Objects.equals(bHand, "바위")) {
        System.out.println("A와 B는 비겼습니다.");
      } else if (Objects.equals(bHand, "보")) {
        System.out.println("B가 이겼습니다.");
      } else {
        System.out.println("B가 이상한 값을 입력했습니다.");
      }
    } else if (Objects.equals(aHand, "보")) {
      if (Objects.equals(bHand, "가위")) {
        System.out.println("B가 이겼습니다.");
      } else if (Objects.equals(bHand, "바위")) {
        System.out.println("A가 이겼습니다.");
      } else if (Objects.equals(bHand, "보")) {
        System.out.println("A와 B는 비겼습니다.");
      } else {
        System.out.println("B가 이상한 값을 입력했습니다.");
      }
    } else {
      System.out.println("A가 이상한 값을 입력했습니다.");
    }

  }
}
