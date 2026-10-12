import java.util.*;
class A6c { 
    public static void main(String args[]) { 
        Scanner sc=new Scanner(System.in);
	System.out.print("How many elements :");
	int n=sc.nextInt();
        int arr[]=new int[n]; 
        int i,j;
        System.out.println("Enter elements:"); 
        for(i=0;i<arr.length;i++){ 
            arr[i]=sc.nextInt(); 
        }
	int min=arr[0], max=arr[0];
        for(i=0;i<arr.length;i++) { 
             if(arr[i]>max){
	         max=arr[i];
	     }
	     else if(arr[i]<min){
		 min=arr[i];
	     }
        }
	System.out.println("Maximum value for the above array= "+max);
	System.out.println("Minimum value for the above array= "+min);
        sc.close(); 
    } 
}