package OOP06.templateCallbachPattern;

public class Soldier {

  void fight_Against(String weaponSound){
    System.out.println("전투 시작");
    executeWeapon(weaponSound).useWeapon();
    System.out.println("전투 종료");
  }
  private  Weapon executeWeapon(final String weaponSound){
    return new Weapon() {
      @Override
      public void useWeapon() {
        System.out.println(weaponSound);
      }
    };
  }
}
