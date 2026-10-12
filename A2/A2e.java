import java.lang.*;
class A2e{
	public static void main(String args[]){
		double mins=3355336,day,year,rem_mins;
		year=mins/525960;
		rem_mins=mins%525960;
		day=rem_mins/1440;
		rem_mins=rem_mins%1440;
		System.out.println("Total Minutes : "+(int)mins+" mins");
		System.out.println("Years : "+(int)year+" years");
		System.out.println("Days : "+(int)day+" days");
		System.out.println("Remaining Minutes : "+(int)rem_mins+" mins");
	}
}