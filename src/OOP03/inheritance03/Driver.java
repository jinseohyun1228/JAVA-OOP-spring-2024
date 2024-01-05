package OOP03.inheritance03;

public class Driver {
  public static void main(String[] args) {
    Penguin proro = new Penguin();
    proro.name = "뽀로로";
    proro.habitat = "눈 덮인 숲속 마을";

    proro.showName();
    proro.showHabitat();

    Anlimal pingu = new Penguin();

    pingu.name = "핑구";
//    pingu.habitat = "눈 덮인 숲속 마을";

    pingu.showName();
//    pingu.showHabitat();


  }
}
