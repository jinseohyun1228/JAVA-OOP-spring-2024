package OOP02.srart;

/*
1. 모든 자바프로그램에 포함된 “java.lang”을 스태틱 영역에 놓는다.
2. 프로그램 상의 모든 클래스를 T 메모리의 스태틱 영역에 배치한다.
*/
public class Start3 {
  // main메서드의 스택 프레임을 스택영역에 할당한다.
  public static void main(String[] args) {
    // 각각의 변수를 할당한다.
    int i = 10;
    int k = 20;

    // 괄호로 만들어지는 블록의 스택프레임을 main 스택 프레임내에 할당한다.
    if (i == 10) {
      int m = k + 5;
      k = m;
    } else {
      int p = k + 10;
      k = p;
    }
    //할당한 스택 프레임을 종료한다.
    //따라서 스택프레임내에 있던 변수 m은 종료된다.

  }
}
