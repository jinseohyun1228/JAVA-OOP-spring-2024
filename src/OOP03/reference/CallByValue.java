package OOP03.reference;

public class CallByValue {
  // 기본 자료형 변수를 복사하는 경우 : 단순 복사, 관계 없음
  public static void main(String[] args) {
    int a = 10;
    int b = a;

    b = 20;

    System.out.println("a = " + a);
    System.out.println("b = " + b);
  }
}
