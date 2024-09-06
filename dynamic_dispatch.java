class Animal_ {
  void makeSound() {
      System.out.println("Animal makes a sound");
  }
}

class Dog extends Animal_ {
  @Override
  void makeSound() {
      System.out.println("Dog barks");
  }
}

public class dynamic_dispatch {
  public static void main(String[] args) {
      Animal_ myAnimal = new Animal_();
      Animal_ myDog = new Dog();

      myAnimal.makeSound();
      myDog.makeSound();
  }
}
