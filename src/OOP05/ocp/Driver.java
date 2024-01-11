package OOP05.ocp;

public class Driver {
  K7 seohyunCar = new K7();
  Client seohyun = new Client(seohyunCar);

  // 마티즈로 변경하고 싶은데?
  Matiz matiz = new Matiz();
  // Client client = new Client(matiz);
  // 클라이언트의 내부 코드에 가서 직접 변경을 해야한다.
}
