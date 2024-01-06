package OOP04.finalKeyword;

//public class ClassB extends finalClass{ }

public class ClassB extends ClassA{
  @Override
  int addMethod(int a, int b) {
    return a - b;
  }

//  int finaladdMethod(int a, int b) {return a - b;}

}
