package OOP03.encapsulation02.packageTwo;

import OOP03.encapsulation02.packageOne.ClassA;

public class ClassAB extends ClassA {

  void runSomeThing(){
//    int priSt1 = ClassA.priSt;
//    int defSt1 = ClassA.defSt;
    int proSt1 = ClassA.proSt;
    int pubSt1 = ClassA.pubSt;

//  ClassAB는 CalssA를 상속받아서 바로 접급할 수 있음.
//    int priSt2 = priSt;
//    int defSt2 = defSt;
    int proSt2 = proSt;
    int pubSt2 = pubSt;
  }

  static void runStaticThing() {
//    int priSt1 = ClassA.priSt;
//    int defSt1 = ClassA.defSt;
    int proSt1 = ClassA.proSt;
    int pubSt1 = ClassA.pubSt;

//    int priSt2 = priSt;
//    int defSt2 = defSt;
    int proSt2 = proSt;
    int pubSt2 = pubSt;
  }
}
