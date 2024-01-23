package OOP06.decoratorPattern;

public class Driver {
  public static void main(String[] args) {
    Reder reder = new Decoreator();

    System.out.println(reder.readBook());
  }
}
