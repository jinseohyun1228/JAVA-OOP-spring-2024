package OOP06.proxyPattern;

public class Proxy implements Reder{
  BookReader bookReader = new BookReader();

  public String readBook() {
    System.out.println("용량 체크!");
    return bookReader.readBook();
  }
}
