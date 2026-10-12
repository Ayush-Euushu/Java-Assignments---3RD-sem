import java.lang.*;
class A1e{
	public static void main(String args[]){
		double a=20,b=15,c=10;
		System.out.println("Sides : a= "+a+" , b= "+b+" , c= "+c);
		double s=(a+b+c)/2;
		System.out.println("Semi perimeter : S= "+s);
		double area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println("Area of triangle : Area= "+area );
	}
}