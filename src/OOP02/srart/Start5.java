package OOP02.srart;

/*
1. 모든 자바프로그램에 포함된 “java.lang”을 스태틱 영역에 놓는다.
2. 프로그램 상의 모든 클래스를 T 메모리의 스태틱 영역에 배치한다.
*/
public class Start5 {
  // 스태틱 영영에 static로 선언된 전역변수 share의 저장 영역을 만든다.
  // 스태틱 변수는 어디에서나 공유된다.
  static int share;

  // 스택 영역에 main 메서드용 스택 프레임을 만든다.
  public static void main(String[] args) {
    share = 55;

    //fun메서드를 실행한다.
    int k = fun(5,7);
    //종료한다.

    System.out.println(share);
  }

  // 스태틱 영역에 fun용 스택 프레임을 할당한다.
  private static int fun(int m, int p) {
    share = m + p;

    return m-p;
  }
}
