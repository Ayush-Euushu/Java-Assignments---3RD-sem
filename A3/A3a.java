import java.util.*;
class A3a{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		double s1,s2,s3,s4,s5,per,t;
		System.out.println("Enter Subject-1 Marks: ");
		s1=sc.nextDouble();
		System.out.println("Enter Subject-2 Marks: ");
		s2=sc.nextDouble();
		System.out.println("Enter Subject-3 Marks: ");
		s3=sc.nextDouble();
		System.out.println("Enter Subject-4 Marks: ");
		s4=sc.nextDouble();
		System.out.println("Enter Subject-5 Marks: ");
		s5=sc.nextDouble();
		sc.close();
		t=s1+s2+s3+s4+s5;
		per=(t)/5;
		System.out.println("Total Marks: "+t);
		System.out.println("Percentage : "+per);
	}
}