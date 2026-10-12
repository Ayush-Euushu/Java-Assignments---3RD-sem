import java.util.*;
class A3b{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		double GS,basic,HRA,DA;
		System.out.println("Enter Basic Salary: ");
		basic=sc.nextDouble();
		HRA=basic*0.1;
		DA=basic*0.6;
		GS=basic+HRA+DA;
		System.out.println("Gross Salary Calculated: RS "+GS);
		sc.close();
	}
}