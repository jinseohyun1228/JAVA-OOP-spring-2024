package OOP03.abstraction01;
/*
T메모리의 스태틱 영역에 할당 될 때,
  Mouse의 변수들은 static로 선언 ❌
  객체 변수, 인스턴스 변수임
 */
public class Mouse {
  public String name;
  public int age;
  public int countOfTail;

  public void sing() {
    System.out.println(name + ": 찍찍!!🐭" );
  }
}
