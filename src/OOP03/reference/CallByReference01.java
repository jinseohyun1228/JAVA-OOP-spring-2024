package OOP03.reference;


import OOP03.polymorphism01.Anlimal;

public class CallByReference01 {
  public static void main(String[] args) {
    Anlimal ref_a = new Anlimal();
    Anlimal ref_b = ref_a;

    ref_a.age = 10;
    ref_b.age = 20;

    System.out.println("ref_a = " + ref_a);
    System.out.println("ref_b = " + ref_b);

    System.out.println("ref_a.age = " + ref_a.age);
    System.out.println("ref_b.age = " + ref_b.age);
  }
}
