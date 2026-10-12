import java.util.*;
class A6e{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements for Array 1: ");
        int n1=sc.nextInt();
        String[] arr1=new String[n1];
        System.out.println("Enter " + n1 + " elements for Array 1:");
        for (int i=0;i<n1;i++){
            arr1[i]=sc.next();
        }
        System.out.print("Enter the number of elements for Array 2: ");
        int n2 = sc.nextInt();
        String[] arr2=new String[n2];
        System.out.println("Enter " + n2 + " elements for Array 2:");
        for (int i=0;i<n2;i++){
            arr2[i]=sc.next();
        }
        int max_n=n1;
        if (n2<max_n){
            max_n=n2;
        }
        String[] common=new String[max_n];
        int count=0;
        for (int i=0;i<arr1.length;i++){
            for (int j=0; j<arr2.length;j++){
                if (arr1[i].equals(arr2[j])){
                    boolean added=false;
                    for(int k=0;k<count;k++){
                        if (common[k].equals(arr1[i])){
                            added=true;
                            break;
                        }
                    }
                    if (!added){
                        common[count] = arr1[i];
                        count++;
                    }
                    break; 
                }
            }
        }
        System.out.print("Common element is : [");
        for (int i=0;i<count;i++){
            System.out.print(common[i]);
            if (i<count-1){
                System.out.print(",");
            }
        }
        System.out.println("]");
        sc.close();
    }
}