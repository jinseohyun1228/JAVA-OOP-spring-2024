package OOP03.abstraction01;
/*
1. 모든 자바프로그램에 포함된 “java.lang”을 스태틱 영역에 놓는다.
2. 프로그램 상의 모든 클래스를 T 메모리의 스태틱 영역에 배치한다. :  Mouse , MouseDriver
   - Mouse 영역의 변수 :
        Static ❌ -> 클래스 변수가 아닌 객체 변수, 즉 인스턴스 변수이다.
        따라서 스태틱 영역에 저장 공간 할당 안됨.
 */
public class MouseDriver {
  //메서드는 스택 영역에 스택프레임으로 할당
  public static void main(String[] args) { //static ⭕ -> 즉 클래스 메서드
    //main 스택 프레임의 변수 저장공간에 mickey 할당
    Mouse mickey = new Mouse();
    /*
    1. mickey의 타입은 Mouse
    2. Mouse 객체를 만드는 생성자
    3. 새로운 객체의 ⭐주소를 ⭐객체 참조 변수 mickey에 대입
     */

    mickey.name = "미키";
    mickey.age = 8;
    mickey.countOfTail = 1;

    mickey.sing();

    mickey = null;

    Mouse jerry = new Mouse();

    jerry.name = "제리";
    jerry.age = 6;
    jerry.countOfTail = 1;

    jerry.sing();

  }
}
