package OOP03.polymorphism01;

public class Penguin extends Anlimal {
  public String habitat;

  public void showHabitat() {
    System.out.printf("%s는 %s에 살아\n", name, habitat);
  }

  @Override
  public void showName() {
    System.out.println("이 펭귄의 이름은 " +name+ "입니다.");
  }
  public void showName(String s) {
    System.out.println("안녕하세요! " + s +"씨" +
            " 이 펭귄의 이름은 " +name+ "입니다.");
  }


}
