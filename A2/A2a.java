  import java.lang.*;
class A2a{
	public static void main(String args[]){
		int n=236;
		double o=n,d,sum=0;
		while(n>0){
			d=n%10;
			sum=sum+d;
			n=n/10;
		}
		System.out.println("Sum of the digits in "+o+" is: "+sum);
	}
}