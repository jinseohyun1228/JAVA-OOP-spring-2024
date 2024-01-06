package OOP04.staticBlock;

class ClassA {
  static String Classname = "ClassA";

  static {
    System.out.println("ClassA가 스태틱 영역에 올라갔습니다.");
  }
}

class ClassB extends ClassA{
  static void staticMethod(){
    System.out.println("ClassB의 정적 메서드");
  }
  static {
    System.out.println("ClassB가 스태틱 영역에 올라갔습니다.");
  }
}

class ClassC {
  static {
    System.out.println("ClassC가 스태틱 영역에 올라갔음");
  }
  {
    System.out.println("ClassC의 인스턴스가 생성");
  }
}
