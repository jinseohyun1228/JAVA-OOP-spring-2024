package OOP03.encapsulation02.packageTwo;


import OOP03.encapsulation02.packageOne.ClassA;

public class ClassC {
  void runSomeThing(){
//  📌 public으로만 가능
    int pubSt = ClassA.pubSt;


    ClassA classA = new ClassA();
    int pubSt1 = classA.pubSt;
  }

  static void runStaticThing() {
    int pubSt = ClassA.pubSt;

    ClassA classA = new ClassA();
    int pubSt1 = classA.pubSt;
  }
}