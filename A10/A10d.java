class UniversityStudent{
    static String universityName="National Technical University";
    static int totalStudents=0;
    String studentName;
    int rollNo;
    static{
	System.out.println("\n--- Creating Static Block ---");
        System.out.println("[Static Block] University system initialized. Total students registered: " + totalStudents);
    }
    public UniversityStudent(String studentName,int rollNo){
        this.studentName=studentName;
        this.rollNo=rollNo;
        totalStudents++;
    }
    public void displayStudentDetails(){
        System.out.println("Roll No: "+rollNo+" | Name: "+studentName+" | University: "+universityName);
    }
    public static void displayTotalCount(){
        System.out.println("[Static Method] Total active students in system: "+totalStudents);
    }

}
public class A10d{
    public static void main(String[] args){
        UniversityStudent.displayTotalCount();
        System.out.println("\n--- Creating Student Objects ---");
        UniversityStudent s1=new UniversityStudent("Rahul Sharma",101);
        UniversityStudent s2=new UniversityStudent("Priya Patel",102);
        s1.displayStudentDetails();
        s2.displayStudentDetails();
        System.out.println("\n--- Accessing Static Members ---");
        UniversityStudent.displayTotalCount();
        UniversityStudent.universityName="Global Tech University";
        System.out.println("\nAfter modifying shared static variable:");
        s1.displayStudentDetails();
        s2.displayStudentDetails(); 
    }
}