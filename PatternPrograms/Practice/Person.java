


class Person{
	 String name;
	 int age;
	
	public Person() {
		
	}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public void showRecord() {
		System.out.println("Name = "+name);
		System.out.println("Age = "+age);
	}
}
class Employee extends Person{
	 int empid;
	 float salary;
	
	public Employee() {
		
	}
	public Employee(int empid, float salary) {
		this.empid = empid;
		this.salary = salary;
	}
	void printRecord() {
		System.out.println("Empid = "+empid);
		System.out.println("Salary = "+salary);
	}
}
public class Program {
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.empid = 10;
		emp.salary = 12345.67f;
		emp.name = "Rohit";
		emp.age = 28;
	}

	public static void main2(String[] args) {
		Employee emp = new Employee();
		emp.printRecord();
	}
	public static void main1(String[] args) {
		Person p1 = new Person();
		p1.showRecord();
	}

}
