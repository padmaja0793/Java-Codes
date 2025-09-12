// Create an Shape class with an area() method.
//Sublclasses: Circle, Rectangle, Square
//Override sound() in each subclass to print different sounds.

//Parent class 

class Shape {
    void area(){
        System.out.println("ARC length and area of A sector");
    }
}
//Subclass = Circle

class Circle extends Shape {
    @Override
    void area() {
        System.out.println("The area of circle");
    }
}

//Subclass = Rectangle

class Rectangle extends Shape {
    @Override
    void area() {
        System.out.println("The area of Rectangle");
    }
}

// Subclass = Square

class Square extends Shape {
    @Override
    void area() {
        System.out.println("The area of Square");
    }
}

//Main class

public class Polymorphism2{
    public static void main (String args[]){


        //Parent class reference but diffrent object

        Shape s;

        s = new Circle();          //Circle Object
        s.area();                  //OP = The area of circle
       
        s = new Rectangle();      //Rectangle Object
        s.area();                 //OP = The area of Rectangle

        s = new Square();          //Sruare Object
        s.area();                  // OP =  The area of Square

    }
}