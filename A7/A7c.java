import java.util.Scanner;
class Area{
    static void rectangle(int l,int b){
        System.out.println("Area of rectangle : "+(l*b));
    }
    void square(int s){
        System.out.println("Area of square : "+(s*s));
    }
}
public class A7c{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter length of rectangle : ");
        int l=sc.nextInt();
        System.out.print("Enter breadth of rectangle : ");
        int b=sc.nextInt();
        Area.rectangle(l,b);
        System.out.print("Enter side of square : ");
        int s=sc.nextInt();
        Area a=new Area();
        a.square(s);
        sc.close();
    }
}