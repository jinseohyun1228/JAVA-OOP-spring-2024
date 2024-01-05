package OOP03.inheritance01;

public class Driver02 {
  public static void main(String[] args) {
    //😎 하위 클래스는 모두?? 상위 클래스
    동물 animal = new 동물();
    동물 mammalia = new 포유류();
    동물 bird = new 조류();
    동물 whale = new 고래();
    동물 bat = new 박쥐();
    동물 sparrow = new 참새();
    동물 penguin = new 펭귄();

    animal.showMe();
    mammalia.showMe();
    bird.showMe();
    whale.showMe();
    bat.showMe();
    sparrow.showMe();
    penguin.showMe();

    //🤔 흠... 객체 참조 변수명은 다 다르지만 타입은 동물로 모두 동일하네..?
    // 이 변수를 모두 한번에 사용할 수 있지 않을까?
    }
  }

