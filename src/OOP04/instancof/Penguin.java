package OOP04.instancof;

import OOP03.inheritance03.Anlimal;

public class Penguin extends Anlimal {
  public String habitat;

  public void showHabitat() {
    System.out.printf("%s는 %s에 살아\n", name, habitat);
  }
}
