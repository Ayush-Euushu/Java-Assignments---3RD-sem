public class A11b{
    public static void main(String[] args){
        String str1="Hello";
        String str2="Hello";
        boolean isEqual=true;
        if(str1.length()!=str2.length())
            isEqual=false;
        else{
            char[] arr1=str1.toCharArray();
            char[] arr2=str2.toCharArray();
            for (int i=0;i<arr1.length;i++){
                if (arr1[i]!=arr2[i]){
                    isEqual=false;
                    break;
                }
            }
        }
        if(isEqual)
            System.out.println("Both strings contain the same data.");
        else
            System.out.println("Strings do not contain the same data.");
    }
}
