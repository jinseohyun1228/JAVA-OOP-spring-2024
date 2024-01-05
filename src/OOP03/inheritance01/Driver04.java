package OOP03.inheritance01;

public class Driver04 {
  public static void main(String[] args) {
    헤엄칠수있는[] ableToSwim = new 헤엄칠수있는[2];

    ableToSwim[0] = new 고래();
    ableToSwim[1] = new 펭귄();

    for (int index = 0; index < ableToSwim.length; index++) {
      ableToSwim[index].swim();
    }
  }
}
