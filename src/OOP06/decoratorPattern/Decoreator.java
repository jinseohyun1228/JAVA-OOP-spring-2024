package OOP06.decoratorPattern;

public class Decoreator implements Reder {
  BookReader bookReader = new BookReader();

  public String readBook() {
    System.out.println("용량 체크!");
    return "🩷북 리더기🩷"+ bookReader.readBook();
  }
}
