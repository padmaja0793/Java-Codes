
class Animal {                                               
    void eat() {                                                
        System.out.println("Animal is eating");    
    }
}

class Dog extends Animal {     
    @Override   
    void eat() {      //Overriding
         System.out.println("Dog eats bones");  
    }

    void bark(){                          
        System.out.println("Dog is barking");  
    }
}



class Puppy extends Dog{ 
     @Override 
        void eat() {      //Overriding again
         System.out.println("Puppy drinks milk");  
    }   
      void weep() {                               
        System.out.println("Puppy is weeping");
      }
}

class Cat extends Animal {
     @Override 
        void eat() {      //Overriding again
         System.out.println("Cat drinks milk");  
        }
    void meow() {
        System.out.println("Cat meow");
    }
}

public class ProgOverriding {
    public static void main(String args[])

{   
    Animal a;

        a = new Dog();   
        a.eat();       

        a = new Puppy();   
        a.eat();       

        a = new Cat();   
        a.eat();       
    }
}  
