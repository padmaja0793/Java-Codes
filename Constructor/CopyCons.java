class Student {
    String name;
    int age;

    // Parameterized Constructor
    public Student(String n, int a) {
        name = n;
        age = a;
    }

    // Copy Constructor
    public Student(Student s) {
        name = s.name;
        age = s.age;
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class CopyCons {
    public static void main(String[] args) {
        Student s1 = new Student("Padmaja", 20);
        Student s2 = new Student(s1);  // copy constructor वापरून copy

        s1.display();
        s2.display();
    }
}