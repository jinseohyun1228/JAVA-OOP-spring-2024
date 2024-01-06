package OOP04.staticBlock;

public class Driver {
  public static void main(String[] args) {
/*
클래스 B의 정적 메서드 사용 -> 클래스 B가 스태틱 영역에 올라간다.
클래스 B가 상속받은 클래스 A도 스태틱 영역에 올라간다.
 */
    ClassB.staticMethod();
/*
클래스 A의 정적 변수 사용 : 앞서서 클래스 B를 사용하면서 클래스 A가 스택영역에 올라갔다.
따라서 static블록 실행되지 않는다.
 */
    System.out.println(ClassA.Classname + "의 정적 변수 출력");
/*
클래스 C의 인스턴스 생성 : 클래스 C가 스태틱 영역에 올라갔다.
 */

    ClassC classC = new ClassC();
    System.out.println("classC 생성 ");
  }
}
