import java.util.*;
public class A5c { 
    public static void main(String args[]) { 
	Scanner sc=new Scanner(System.in);
	System.out.print("How many elements :");
	int n=sc.nextInt();
        int arr[]=new int[n]; 
        int i,j,temp; 
        System.out.println("Enter elements:"); 
        for(i=0;i<arr.length;i++){ 
            arr[i]=sc.nextInt(); 
        } 
        for(i=0;i<arr.length-1;i++) { 
            for(j=0;j<arr.length-1-i;j++) { 
                if(arr[j]>arr[j+1]) { 
                    temp=arr[j]; 
                    arr[j]=arr[j+1]; 
                    arr[j+1]=temp; 
                } 
            } 
        }
        System.out.println("Sorted array:");
        for(i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
    }
}