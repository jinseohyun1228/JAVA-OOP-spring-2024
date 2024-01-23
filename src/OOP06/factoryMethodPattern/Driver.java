package OOP06.factoryMethodPattern;

public class Driver {
  public static void main(String[] args) {
    HandHygiene useSanitizer = new HandHygien_Sanitizer();
    HandHygiene useSoap = new HandHygien_Soap();

    useSoap.washingHands();
    useSanitizer.washingHands();

    handHygieneProducts sanitizer = useSanitizer.getProducts();
    handHygieneProducts soap = useSoap.getProducts();

    sanitizer.use();
    soap.use();
  }

}
