package OOP03.encapsulation02.packageOne;

public class ClassB {

  ClassA classA = new ClassA();
  void runSomeThing(){
//    int priSt1 = ClassA.priSt;
    int defSt1 = ClassA.defSt;
    int proSt1 = ClassA.proSt;
    int pubSt1 = ClassA.pubSt;

//    상속받지 않았기 때문에 ClassB에는 해당 변수들이 없음...
//    int priSt2 = priSt;
//    int defSt2 = defSt;
//    int proSt2 = proSt;
//    int pubSt2 = pubSt;
  }

  static void runStaticThing() {
//    int priSt1 = ClassA.priSt;
    int defSt1 = ClassA.defSt;
    int proSt1 = ClassA.proSt;
    int pubSt1 = ClassA.pubSt;


// 📌 정적 멤버를 객체 참조 변수를 이용해서도 접근할 수 있지만 이런 방식은 추천되지 않는다.
//    클래스 변수는 클래스명.변수명이 적절하다.
    ClassA classA1 = new ClassA();
//    int priSt2 = classA1.priSt;
    int defSt2 = classA1.defSt;
    int proSt2 = classA1.proSt;
    int pubSt2 = classA1.pubSt;
  }
}
