//1-Create an Animal class with a sound() method.

//Create subclasses: Dog, Cat, Cow.

//Override sound() in each subclass to print different sounds.

//Parent class 

    class Animal {
        void sound () {
            System.out.println("Some generic animal sound");
        }

}
// Subclass - Dog

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks: Bhow Bhow");
    }
}

//Subclass - cat

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows: Meow Meow");
    }
}

// Subclass - Cow 

class Cow extends Animal {
    @Override 
    void sound() {
        System.out.println("Cow moos: Moo Moo");
    }
}

// Main Class

public class Polymorphism {
    public static void main(String[] args) {

       // Parent class reference but different objects
        Animal a;

        a = new Dog();   // Dog object
        a.sound();       // Output -> Dog barks: Woof Woof

        a = new Cat();   // Cat object
        a.sound();       // Output -> Cat meows: Meow Meow

        a = new Cow();   // Cow object
        a.sound();       // Output -> Cow moos: Moo Moo
    }
}  
