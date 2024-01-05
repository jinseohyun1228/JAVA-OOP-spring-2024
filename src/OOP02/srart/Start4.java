package OOP02.srart;

/*
1. 모든 자바프로그램에 포함된 “java.lang”을 스태틱 영역에 놓는다.
2. 프로그램 상의 모든 클래스를 T 메모리의 스태틱 영역에 배치한다.
*/
public class Start4 {
  //main 메서드용 스택 프레임을 스택영역에 할당한다.
  public static void main(String[] args) {
    // main 스택 프레임 영역에 변수를 할당
    int k = 5;
    int m;

    // 메서드의 인자와 반환값을 사용해 변수값을 공유
    m = square(k);
  }

  // square 메서드용 스택 프레임을 스택영역에 할당한다.
  private static int square(int k) {
    // square 스택 프레임 영역에 변수를 할당한다.
    int result;
    k = 25;
    result = k;

    return result;
  }
}
