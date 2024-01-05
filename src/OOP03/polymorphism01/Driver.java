package OOP03.polymorphism01;
public class Driver {
  public static void main(String[] args) {
    Penguin pororo = new Penguin();
    pororo.name = "뽀로로";
    pororo.habitat = "눈 덮인 숲속 마을";

    pororo.showName();
    pororo.showName("서현");
    pororo.showHabitat();

    Anlimal pingu = new Penguin();

    pingu.name = "핑구";
    pingu.showName();
//    pingu.showName("서현");
//    🤔 왜 안될까?

  }
}
