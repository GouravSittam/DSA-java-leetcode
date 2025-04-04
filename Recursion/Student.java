class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class Student extends Person {
    String rollno;
    int marks;

    public Student(String name, int age, String rollno, int marks) {
        super(name, age);
        this.rollno = rollno;
        this.marks = marks;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Roll No: " + rollno + ", Marks: " + marks);
    }

    public static void main(String[] args) {
        Student student1 = new Student("John", 20, "S123", 85);
        student1.display();
    }
}