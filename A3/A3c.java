import java.util.*;
class A3c{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		double current,prev,e,cost=0;
		System.out.print("Enter electricity consumption previous: ");
		prev=sc.nextDouble();
		System.out.print("Enter electricity consumption current: ");
		current=sc.nextDouble();
		sc.close();
		e=current-prev;
		if(e<=100) cost=3*e;
		else if (e<=500) cost=(100*3)+(e-100)*4;
		else cost=(100*3)+(400*4)+(e-500)*6;
		System.out.println("Total electricity cost: RS "+cost);
		System.out.println("Total electricity consumption: "+e+"units");
	}
}