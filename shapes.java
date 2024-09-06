interface Shape {
  double area();
  double perimeter();
}

class Rectangle implements Shape {
  private double length;
  private double width;

  public Rectangle(double length, double width) {
      this.length = length;
      this.width = width;
  }

  @Override
  public double area() {
      return length * width;
  }

  @Override
  public double perimeter() {
      return 2 * (length + width);
  }
}

class Circle implements Shape {
  private double radius;

  public Circle(double radius) {
      this.radius = radius;
  }

  @Override
  public double area() {
      return Math.PI * radius * radius;
  }

  @Override
  public double perimeter() {
      return 2 * Math.PI * radius;
  }
}

public class shapes {
  public static void main(String[] args) {
      Shape rectangle = new Rectangle(5, 7);
      System.out.println("Rectangle Area: " + rectangle.area());
      System.out.println("Rectangle Perimeter: " + rectangle.perimeter());

      Shape circle = new Circle(3.5);
      System.out.println("Circle Area: " + circle.area());
      System.out.println("Circle Perimeter: " + circle.perimeter());
  }
}
