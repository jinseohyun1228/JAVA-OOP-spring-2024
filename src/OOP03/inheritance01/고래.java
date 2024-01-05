package OOP03.inheritance01;

public class 고래 extends 포유류 implements 헤엄칠수있는 {
  public 고래() {
    myClass = "고래";
  }

  @Override
  public void swim() {
    System.out.println("🐋 🏊‍♂️");
  }
}
