package OOP06.proxyPattern;

public class Driver {
  public static void main(String[] args) {
    Reder reder = new Proxy();

    System.out.println(reder.readBook());
  }
}
