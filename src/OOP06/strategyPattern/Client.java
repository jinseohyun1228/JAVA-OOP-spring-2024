package OOP06.strategyPattern;

public class Client {
  public static void main(String[] args) {
    Weapon weapon = null;
    Soldier soldier = new Soldier();

    weapon = new WeaponGun();
    soldier.fight_Against(weapon);

    weapon = new WeaponSword();
    soldier.fight_Against(weapon);
  }
}
