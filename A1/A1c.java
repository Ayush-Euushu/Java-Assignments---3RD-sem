import java.lang.*;
class A1c{
	public static void main(String args[]){
		int a=10,b=20;
		System.out.println("Values before swap : a="+a+", b="+b);
		int temp=a;
		a=b;
		b=temp;
		System.out.println("Swapped values : a="+a+", b="+b);
	}
}