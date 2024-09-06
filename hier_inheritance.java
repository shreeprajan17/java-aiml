class Vehicle
{
    private String make;
    private String model;

    public void setMake(String make)
    {
        this.make = make;
    }

    public String getMake()
    {
        return make;
    }

    public void setModel(String model)
    {
        this.model = model;
    }

    public String getModel()
    {
        return model;
    }
}

class Car extends Vehicle
{
    private int noOfDoors;

    public void setNoOfDoors(int noOfDoors)
    {
        this.noOfDoors = noOfDoors;
    }

    public int getNoOfDoors()
    {
        return noOfDoors;
    }
}

class Bike extends Vehicle
{
    private String type;

    public void setType(String type)
    {
        this.type = type;
    }

    public String getType()
    {
        return type;
    }
}

public class hier_inheritance
{
    public static void main(String[] args) {

        Car toyota = new Car();

        toyota.setMake("Toyota");
        toyota.setModel("Corolla");
        toyota.setNoOfDoors(4);

        Bike yamaha = new Bike();

        yamaha.setMake("Yamaha");
        yamaha.setModel("R1");
        yamaha.setType("Sport");

        System.out.println("Car Make: " + toyota.getMake());
        System.out.println("Car Model: " + toyota.getModel());
        System.out.println("Number of Doors: " + toyota.getNoOfDoors());

        System.out.println("Bike Make: " + yamaha.getMake());
        System.out.println("Bike Model: " + yamaha.getModel());
        System.out.println("Bike Type: " + yamaha.getType());
    }
}