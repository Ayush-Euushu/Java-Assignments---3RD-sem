import java.util.*;
class A6b{ 
    public static void main(String args[]){ 
        Scanner sc=new Scanner(System.in);
	System.out.print("How many elements :");
	int n=sc.nextInt();
        int arr[]=new int[n]; 
        int i,j,sum=0;
        System.out.println("Enter elements:"); 
        for(i=0;i<arr.length;i++){ 
            arr[i]=sc.nextInt(); 
        } 
        for(i=0;i<arr.length;i++){ 
             sum+=arr[i];
        }
	double avg=(sum/n);
	System.out.println("The average of array element is "+ avg);
        sc.close(); 
    } 
}