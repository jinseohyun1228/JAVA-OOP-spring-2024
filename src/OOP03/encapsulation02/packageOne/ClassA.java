package OOP03.encapsulation02.packageOne;

public class ClassA {
  private int pri = 1;
  int def = 1;
  protected int pro = 1;
  public int pub;

  static private int priSt = 2;
  static int defSt = 3;
  static protected int proSt = 2;
  static public int pubSt = 2;
  void runSomeThing(){
    int priSt1 = ClassA.priSt;
    int defSt1 = ClassA.defSt;
    int proSt1 = ClassA.proSt;
    int pubSt1 = ClassA.pubSt;

    int priSt2 = priSt;
    int defSt2 = defSt;
    int proSt2 = proSt;
    int pubSt2 = pubSt;
  }

  static void runStaticThing() {
    int priSt1 = ClassA.priSt;
    int defSt1 = ClassA.defSt;
    int proSt1 = ClassA.proSt;
    int pubSt1 = ClassA.pubSt;

    int priSt2 = priSt;
    int defSt2 = defSt;
    int proSt2 = proSt;
    int pubSt2 = pubSt;
  }

}
