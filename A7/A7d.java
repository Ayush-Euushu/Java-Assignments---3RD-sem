import java.util.*;
class Interest{
    void simpleInterest(double p,int t) {
        double si=(p*5*t)/100;
        System.out.println("Simple Interest : "+si);
    }
    void simpleInterest(double r,int t,int p) {
        double si=(p*r*t)/100;
        System.out.println("Simple Interest : "+si);
    }
}
public class A7d{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Interest i=new Interest();
        System.out.print("Enter principal amount : ");
        double p=sc.nextDouble();
        System.out.print("Enter time : ");
        int t=sc.nextInt();
        i.simpleInterest(p,t);
        System.out.print("Enter rate : ");
        double r=sc.nextDouble();
        System.out.print("Enter time : ");
        t=sc.nextInt();
        i.simpleInterest(r,t,10000);
        sc.close();
    }
}