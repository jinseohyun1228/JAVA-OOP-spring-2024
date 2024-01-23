package OOP06.factoryMethodPattern;

public class HandHygien_Soap extends HandHygiene {
  @Override
  handHygieneProducts getProducts() {
    return new soap();
  }
  @Override
  void step2() {
    System.out.println("비누 사용");
  }
}
