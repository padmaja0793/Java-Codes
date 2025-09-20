

//class  A 

//{      }

//class B extends A
//{      }

//class C extends A

//{      }

class A {
    void show() {
        System.out.println("Inside class A");
    }
}

class B extends A {
    void displayB() {
        System.out.println("Inside class B");
    }
}

class C extends A {
    void displayC() {
        System.out.println("Inside class C");
    }
}

public class Test {
    public static void main(String[] args) {
        B objB = new B();
        objB.show();      // A मधला method
        
        objB.displayB();  // B मधला method

        C objC = new C();
        objC.show();      // A मधला method
        objC.displayC();  // C मधला method
    }
}




