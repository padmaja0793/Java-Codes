class Student {
    String name;
    int age;

    // Default Constructor
    public Student() {
        name = "Padmaja";
        age = 18;
        System.out.println("Default Constructor Called");
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class DefaultCons {
    public static void main(String[] args) {
        Student s1 = new Student();       // object तयार केल्यावर constructor चालेल
        s1.display();
    }
}