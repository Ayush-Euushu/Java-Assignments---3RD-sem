import java.util.*;
class A3d{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		double n;
		System.out.print("Enter a number: ");
		n=sc.nextDouble();
		sc.close();
		if(n<0) System.out.println(n+" is a negative number");
		else if (n==0) System.out.println("Given number is Zero");
		else System.out.println(n+" is a positive number");
	}
}