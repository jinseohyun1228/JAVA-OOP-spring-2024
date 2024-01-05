package OOP03.encapsulation01.packageOne;

public class ClassB {

  ClassA classA = new ClassA();
  void runSomeThing(){
//    int pri1 = classA.pri;
    int def1 = classA.def;
    int pro1 = classA.pro;
    int pub1 = classA.pub;
  }

  static void runStaticThing() {
//📌 정적 메서드는 클래스 변수만 접근 가능!!
  }
}
