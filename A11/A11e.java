public class SecondMostFrequent{
    public static void main(String[] args) {
        String str="successes";
        int[] freq=new int[256];
        for(int i=0;i<str.length();i++) {
            freq[str.charAt(i)]++;
        }
        int firstMax=0,secondMax=0;
        char firstChar=' ',secondChar=' ';
        for(int i=0;i<256;i++){
            if(freq[i]>freq[firstMax]){
                secondMax=firstMax;
                firstMax=i;
            }
	    else if(freq[i]>freq[secondMax]&&freq[i]!=freq[firstMax]){
                secondMax=i;
            }
        }
        if(freq[secondMax]>0)
            System.out.println("The second most frequent character is: '"+(char)secondMax+"'");
	else
            System.out.println("No second most frequent character found.");
    }
}
