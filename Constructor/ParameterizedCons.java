class Student {
    String name;
    int age;

    // Parameterized Constructor
    public Student(String n, int a) {
        name = n;
        age = a;
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class ParameterizedCons {
    public static void main(String[] args) {
        Student s1 = new Student("Padmaja", 22);
        Student s2 = new Student("Pawan", 17);

        s1.display();
        s2.display();
    }
}