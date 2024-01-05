package OOP03.encapsulation01.packageOne;

public class ClassAA extends ClassA{
  ClassA classA = new ClassA();
  void runSomeThing(){
//    int pri1 = this.pri;
//    private는 내부 클래스에서만 접근이 가능하다.
    int def1 = this.def;
    int pro1 = this.pro;
    int pub1 = this.pub;
  }

  static void runStaticThing() {
//📌 정적 메서드는 정전 변수(클래스 변수)만 접근 가능!!
//    int pri1 = classA.pri;
//    int def1 = classA.def;
//    int pro1 = classA.pro;
//    int pub1 = classA.pub;
  }
}
