package OOP06.templateMethodPattern;

abstract public class HandHygiene {
  void washingHands (){
    step1();
    step2();
    System.out.println("손 문지르기");

  }

  void step1(){
    System.out.println("물 묻히기");
  }

  abstract void step2();
}
