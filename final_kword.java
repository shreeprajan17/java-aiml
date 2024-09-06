final class Car
{
    String model;

    public Car(String model)
    {
        this.model = model;
    }

    final String getModel(String model)
    {
        return model;
    }
}

public class final_kword
{
    public static void main(String[] args) {
        Car myCar = new Car("Tesla Model S");
        System.out.println("Car model: " + myCar.model);
    }
}