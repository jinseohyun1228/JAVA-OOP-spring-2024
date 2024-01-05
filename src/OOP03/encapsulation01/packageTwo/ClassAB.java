package OOP03.encapsulation01.packageTwo;

import OOP03.encapsulation01.packageOne.ClassA;

public class ClassAB extends ClassA {

  void runSomeThing(){
//    int pri1 = this.pri; 
//    private는 내부 클래스에서만 접근이 가능하다.
//    int def1 = this.def;
//    default는 동일한 패키지에서만 접근할 수 있다. 
    int pro1 = this.pro;
    int pub1 = this.pub;
  }

  static void runStaticThing() {
//📌 정적 메서드는 클래스 변수만 접근 가능!!
//    따라서 메서드 내에서 객체를 생성 후 객체 참조 변수를 이용해 접근
    ClassAB classAB = new ClassAB();

//    classAB.def;
//    default는 동일한 패키지에서만 접근할 수 있다.
    int pro1 = classAB.pro;
    int pub1 = classAB.pub;
  }
}
