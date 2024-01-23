package OOP06.factoryMethodPattern;

abstract public class HandHygiene {
  void washingHands (){
    step1();
    step2();
    System.out.println("손 문지르기");
  }

  abstract handHygieneProducts getProducts();

  void step1(){
    System.out.println("물 묻히기");
  }
  abstract void step2();


}
