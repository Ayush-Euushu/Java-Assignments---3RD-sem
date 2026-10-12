import java.util.Scanner;
class A4b {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = input.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = input.nextDouble();
        int cut1 = (int) (num1 * 1000);
        int cut2 = (int) (num2 * 1000);
        if (cut1 == cut2) {
            System.out.println("Same up to 3 decimal places.");
        } else {
            System.out.println("They are different.");
        }
        input.close();
    }
}