package OOP06.templateMethodPattern;

public class HandHygien_Sanitizer extends HandHygiene{

  @Override
  void step1() {
    System.out.println("물없이");
  }

  @Override
  void step2() {
    System.out.println("소독제 사용");
  }
}
