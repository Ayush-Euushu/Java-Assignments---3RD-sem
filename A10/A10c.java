class Student{
    String name;
    int age;
    public Student(){
        this("Unknown",18);
        System.out.println("Default constructor called.");
    }
    public Student(String name,int age){
        this.name=name; 
        this.age=age;
        System.out.println("Parameterized constructor called.");
    }
    public void display(){
        System.out.println("Student Name: "+this.name+" ,Age: "+this.age);
    }
}
public class A10c{
    public static void main(String[] args){
        System.out.println("--- Creating Student 1 ---");
        Student s1=new Student("Amit Kumar", 21);
        s1.display();
	System.out.println("\n--- Creating Student 2 ---");
        Student s2=new Student();
        s2.display();
    }
}