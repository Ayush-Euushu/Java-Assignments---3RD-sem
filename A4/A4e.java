import java.util.Scanner;
public class A4e {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a single character from the alphabet: ");
        String entry = input.next();
        if (entry.length() != 1) {
            System.out.println("Invalid Input");
            input.close();
            return;
        }
        char ch = entry.toLowerCase().charAt(0);
        if (ch>='a' && ch<='z') {
            if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
                System.out.println("The character is a Vowel.");
            } else {
                System.out.println("The character is a Consonant.");
            }
        }
	else {
            System.out.println("Invalid Input");
        }
        input.close();
    }
}