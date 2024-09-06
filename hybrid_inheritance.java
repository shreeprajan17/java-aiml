abstract class Vehicle {
  String make;
  String model;

  Vehicle(String make, String model) {
      this.make = make;
      this.model = model;
  }

  abstract void displayInfo();
}

abstract class FourWheeler extends Vehicle {
  int numberOfDoors;

  FourWheeler(String make, String model, int numberOfDoors) {
      super(make, model);
      this.numberOfDoors = numberOfDoors;
  }
}

abstract class TwoWheeler extends Vehicle {
  boolean hasCarrier;

  TwoWheeler(String make, String model, boolean hasCarrier) {
      super(make, model);
      this.hasCarrier = hasCarrier;
  }
}

class Car extends FourWheeler {
  Car(String make, String model, int numberOfDoors) {
      super(make, model, numberOfDoors);
  }

  @Override
  void displayInfo() {
      System.out.println("Make: " + make);
      System.out.println("Model: " + model);
      System.out.println("Number of Doors: " + numberOfDoors);
  }
}

class Bike extends TwoWheeler {
  Bike(String make, String model, boolean hasCarrier) {
      super(make, model, hasCarrier);
  }

  void displayInfo() {
      System.out.println("Make: " + make);
      System.out.println("Model: " + model);
      System.out.println("Has Carrier: " + hasCarrier);
  }
}

public class hybrid_inheritance {
  public static void main(String[] args) {
      Car car = new Car("Honda", "Civic", 4);
      car.displayInfo();

      Bike bike = new Bike("Suzuki", "Hayabusa", false);
      bike.displayInfo();
  }
}
