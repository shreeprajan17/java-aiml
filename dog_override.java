class Animal
{
    void makeSound()
    {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal
{
    void makeSound()
    {
        System.out.println("Dog barks");
    }
}

public class dog_override
{
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Dog myDog = new Dog();

        myAnimal.makeSound();
        myDog.makeSound();
    }
}