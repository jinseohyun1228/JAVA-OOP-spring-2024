package OOP04.instancof;

public class Sparrow extends Anlimal implements Fly{
  @Override
  public void fly() {
    System.out.println("참새 날다.");
  }
}
