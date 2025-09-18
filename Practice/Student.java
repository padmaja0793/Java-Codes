class Student {
    //Fields (variable)

    int id;                      //instance field
    String name;                 //instance field
    static String clg  = "Annasaheb Magar";        //static field


    //Constructor 

    public Student () {
        //parameterless cons
    }
    public Student (int id, String name) {    //parameteriswe cons
        this.id = id;
        this.name = name;
    }

// Non-static method (Instance method)
public void displayDetails() {
    System.out.println("Id:  " + id);
    System.out.println("Name:  " + name);
}

//Static method
public static void printClg() {
    System.out.println("Clg:  "  + clg);
}

public static void main(String args[]) {
             //Object tayar karun non-static la method call
             Student s1 = new Student(1, "Padmaja");
             Student s2 = new Student(2, "Pawan");

             s1.displayDetails();
             s2.displayDetails();

            //Static method call - without object
             Student.printClg();
}
}
