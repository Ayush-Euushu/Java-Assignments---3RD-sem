import java.util.*;
class A6d { 
    public static void main(String args[]) { 
        Scanner sc=new Scanner(System.in);
	System.out.print("How many elements :");
	int n=sc.nextInt();
        int arr[]=new int[n]; 
        int i,j,dup_count=0;
        System.out.println("Enter elements:"); 
        for(i=0;i<arr.length;i++){ 
            arr[i]=sc.nextInt(); 
        }
	sc.close();
	for(i=0;i<arr.length;i++){
		int count=0;
		int duplicate=arr[i];
		for(j=i+1;j<arr.length;j++){
			if(arr[i]==arr[j]){
				count++;
			}
		}
		if(count>0){
			System.out.println("Duplicate Element:"+arr[i]);
			dup_count++;
		}
	}
	if(dup_count==0) System.out.print("No duplicate elements");
    }
}