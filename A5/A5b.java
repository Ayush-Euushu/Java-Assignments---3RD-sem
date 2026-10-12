import java.util.*;
class A5b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many terms of (1/x!) :");
	int n=sc.nextInt();
	sc.close();
	double e=0;
	for(int i=1;i<=n;i++){
	    double fact=1;
	    for(int j=1;j<=i;j++){
		fact*=j;
	    }
	    System.out.println(fact);
	    e+=(1/fact);
	    System.out.println(e);
	}
	System.out.printf("The value of 'e' upto %d term is : %f",n,e);
    }
}