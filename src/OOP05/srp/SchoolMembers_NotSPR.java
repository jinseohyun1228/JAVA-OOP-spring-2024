package OOP05.srp;

public class SchoolMembers_NotSPR {
  final Role role;
  public SchoolMembers_NotSPR(Role role) {
    this.role = role;
  }

  void toBeActive() {
    if (this.role == Role.STUDENT){
      System.out.println("학습하다.");
    }else {
      System.out.println("가르치다.");
    }
  }
}
