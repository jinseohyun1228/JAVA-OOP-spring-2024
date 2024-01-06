package OOP05.srp;

public class Driver {
  public static void main(String[] args) {
    SchoolMembers_NotSPR seohyun = new SchoolMembers_NotSPR(Role.STUDENT);
    SchoolMembers_NotSPR eunjin = new SchoolMembers_NotSPR(Role.TEACHER);

    seohyun.toBeActive();
    eunjin.toBeActive();

    SchoolMembers student = new Student();
    SchoolMembers teacher = new Teacher();

    student.toBeActive();
    teacher.toBeActive();
  }
}
