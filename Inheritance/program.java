//  Sigle multilevel Hirarchical use karun program write karycha ahe
class Animal {                                                  //parent class animal
    void eat() {                                                 //eat method
        System.out.println("Animal is eating");    //kontahi classs la animal extends karu shkto
    }
}

class Dog extends Animal {            //Dog ha animal cha child ahe
    void bark(){                          // dog cha animal cha method eat ahe
        System.out.println("Dog is barking");  // dog cha method baek()
    }                             //ek class dusryakadun directly inherit krto 
}



class Puppy extends Dog{                   //puppy dog cha child ahe
    void weep(){                               //        
        System.out.println("Puppy is weeping");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("Cat meow");
    }
}

public class program {
    public static void main(String args[])
{   
    System.out.println(" single I");
    Dog d = new Dog();
        d.eat();
        d.bark();
    
    System.out.println("multilevel");
    Puppy p = new Puppy();
        p.eat();
        p.bark();
        p.weep();
    
    System.out.println("hierarchical");
    Cat c = new Cat();
        c.eat();
        c.meow();
    }
}