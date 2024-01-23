package OOP06.strategyPattern;

public class Soldier {

  void fight_Against(Weapon weapon){
    System.out.println("전투 시작");
    weapon.useWeapon();
    System.out.println("전투 종료");
  }
}
