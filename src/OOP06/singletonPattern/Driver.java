package OOP06.singletonPattern;

public class Driver {
  public static void main(String[] args) {
    Dictionary dictionary = Dictionary.offerDictionary();

    System.out.println(dictionary.getContents());
  }

}
