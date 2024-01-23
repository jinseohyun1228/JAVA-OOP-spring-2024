package OOP06.factoryMethodPattern;
public class sanitizer implements handHygieneProducts{

  @Override
  public void use() {
    System.out.println("소독제 사용");
  }
}
