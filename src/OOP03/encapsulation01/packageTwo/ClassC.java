package OOP03.encapsulation01.packageTwo;

import OOP03.encapsulation01.packageOne.ClassA;

public class ClassC {
  void runSomeThing(){
//📌 ClassA를 상속받지 않았기 때문에 객체를 생성 후 객체 참조 변수를 이용 접근 가능
    ClassA classA = new ClassA();

//   pri,def,pro ❌
    int pub = classA.pub;
//📌  ClassA가 속한 패키지와 다른 패키지이기 때문에, public 변수만 접근이 가능하다.
  }

  static void runStaticThing() {
//📌 정적 메서드는 클래스 변수만 접근이 가능하다.
  }
}