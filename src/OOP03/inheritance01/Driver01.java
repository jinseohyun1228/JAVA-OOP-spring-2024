package OOP03.inheritance01;

public class Driver01 {
  public static void main(String[] args) {
    // 😎 우와 extends를 쓰니까 재사용할 수 있네!! showMe를 하나하나 만들지 않아도 돼!!
    동물 animal = new 동물();
    포유류 mammalia = new 포유류();
    조류 bird = new 조류();
    고래 whale = new 고래();
    박쥐 bat = new 박쥐();
    참새 sparrow = new 참새();
    펭귄 penguin = new 펭귄();

    animal.showMe();
    mammalia.showMe();
    bird.showMe();
    whale.showMe();
    bat.showMe();
    sparrow.showMe();
    penguin.showMe();

    //🤔 흠... 근데 하위 클래스 모두 상위 클래스이잖아.
    //객체 참조 변수는 모두 동물이잖아!!
  }
}