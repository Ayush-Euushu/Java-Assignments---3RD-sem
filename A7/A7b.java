import java.util.*;
class Student{
    String name;
    int rollNo;
    String course;
    Student(String n,int r){
        name=n;
        rollNo=r;
    }
    public void selectCourse(int choice){
        if(choice==1) course="CSE";
        else if(choice==2) course="ECE";
        else if(choice==3) course="EEE";
        else if(choice==4) course="ME";
        else course="Invalid course";
    }
    public void display(){
        System.out.println("Student name : "+name);
        System.out.println("Roll no. : "+rollNo);
        System.out.println("Course selected : "+course);
    }
}
public class A7b{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter student name : ");
        String name=sc.next();
        System.out.print("Enter roll no. : ");
        int rollNo=sc.nextInt();
        Student s=new Student(name,rollNo);
        System.out.println("Choose a course:");
        System.out.println("1. CSE");
        System.out.println("2. ECE");
        System.out.println("3. EEE");
        System.out.println("4. ME");
        System.out.print("Enter your choice : ");
        int choice=sc.nextInt();
        s.selectCourse(choice);
        System.out.println();
        System.out.println("Displaying student details :");
        s.display();
        sc.close();
    }
}