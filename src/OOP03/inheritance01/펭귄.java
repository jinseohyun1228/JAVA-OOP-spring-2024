package OOP03.inheritance01;

public class 펭귄 extends 조류 implements 헤엄칠수있는 {
  public 펭귄() {
    myClass = "펭귄";
  }

  @Override
  public void swim() {
    System.out.println("🐧 🏊‍♂️");
  }

}
