package OOP05.ocp;

public class Client {
  private Car car;

  public Client(Car car) {
    this.car = car;
  }

  void stepOnTheBrakes (){
    this.car.brake();
  }
}
