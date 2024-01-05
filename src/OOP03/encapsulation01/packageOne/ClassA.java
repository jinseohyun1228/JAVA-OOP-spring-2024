package OOP03.encapsulation01.packageOne;

public class ClassA {
  private int pri = 1;
  int def = 1;
  protected int pro = 1;
  public int pub;
  void runSomeThing(){
    int pri1 = this.pri;
    int def1 = this.def;
    int pro1 = this.pro;
    int pub1 = this.pub;

  }

  static void runStaticThing() {
// 📌 정적 메서드는 정전 변수(클래스 변수)만 접근 가능!!
//    int pri1 = this.pri;
//    int def1 = this.def;
//    int pro1 = this.pro;
//    int pub1 = this.pub;

// 객체 변수는 객체를 생성 후에 객체 참조 변수를 통해 접근이 가능하다.
    ClassA classA = new ClassA();

    int pri1 = classA.pri;
    int def1 = classA.def;
    int pro1 = classA.pro;
    int pub1 = classA.pub;
  }

}
