import java.util.*;
class A6a{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
	System.out.print("How many elements :");
	int n=sc.nextInt();
        int arr[]=new int[n]; 
        int i,j,temp;
        System.out.println("Enter elements:"); 
        for(i=0;i<arr.length;i++){ 
            arr[i]=sc.nextInt(); 
        }
	sc.close();
	System.out.println("Performing Insertion Sort");
	for (i=1;i<arr.length;i++){
            temp=arr[i];
            j=i-1;
            while(j>=0 && arr[j]>temp){
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=temp;
        }
	System.out.print("Sorted Array : ");
	for(i=0;i<arr.length;i++){
		System.out.print(arr[i]+" ");
	}
    }
}