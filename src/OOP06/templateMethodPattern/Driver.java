package OOP06.templateMethodPattern;

public class Driver {
  public static void main(String[] args) {
    HandHygiene sanitizer = new HandHygien_Sanitizer();
    HandHygiene soap = new HandHygien_Soap();

    sanitizer.washingHands();
    soap.washingHands();
  }

}
