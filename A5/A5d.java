import java.util.*;
public class A5d { 
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
        System.out.println();
        System.out.println("Enter item to search for:"); 
        int item=sc.nextInt(); 
        int high=arr.length-1; 
        int low=0; 
        int mid=0; 
        boolean found=false; 
        while(low<=high){ 
            mid=(low+high)/2;
            if(item==arr[mid]){ 
                found=true; 
                break; 
            } 
	    else if(item>arr[mid]){ 
                low=mid+1; 
            }
            else{ 
                high=mid-1; 
            } 
        }
        if(found){ 
            System.out.println("Item Found at index position: "+mid); 
        } 
        else{ 
            System.out.println("Item not Found"); 
        }
        sc.close(); 
    } 
}