public class A11c{
    public static void main(String[] args){
        String str="The quick brown fox jumps over the lazy dog";
        String lowerStr=str.toLowerCase();
        System.out.println("Character | First Index");
        System.out.println("-----------------------");
        for(char ch='a';ch<='z';ch++){
            int index=lowerStr.indexOf(ch);
            System.out.println("    "+ch+"     |    "+index);
        }
    }
}
