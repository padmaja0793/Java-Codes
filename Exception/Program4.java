class A extends Exception{}
class B extends Exception{}
class C extends Exception{}
class D extends Exception{}

class Person {
    public void print() throws A,B,C {
        System.out.println("Inside Person class Print method");
    }
}

