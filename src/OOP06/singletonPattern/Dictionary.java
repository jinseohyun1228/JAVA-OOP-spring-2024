package OOP06.singletonPattern;

public class Dictionary {
  private static Dictionary dictionary;
  private String contents = "ㄱㄴㄷ~~~~~~~~~";
  private Dictionary(){};
  public static Dictionary offerDictionary (){
    if (dictionary == null){
      dictionary = new Dictionary();
    }

    return dictionary;
  }

  public String getContents() {
    return contents;
  }
}
