package OOP02.srart;

/*
1. 모든 자바프로그램에 포함된 “java.lang”을 스태틱 영역에 놓는다.
2. 프로그램 상의 모든 클래스를 T 메모리의 스태틱 영역에 배치한다.
*/
public class Start2 {
  //스택 영영엑 메서드 당 스택 프레임을 만들어준다.
  public static void main(String[] args) {
    // 스택 프레임 내에 변수 저장 영역을 부여한다.
    int i;
    i = 10;

    // 스택 프레임내에 변수 저장 영역을 부여한다.
    double d = 20.0;
  }
}
