import java.util.Scanner;
class A4a{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter coefficients for ax^2 + bx + c = 0");
        System.out.print("Enter a: ");
        double a = sc.nextDouble();       
        System.out.print("Enter b: ");
        double b = sc.nextDouble();     
        System.out.print("Enter c: ");
        double c = sc.nextDouble();
        if (a == 0){
            System.out.println("Not a quadratic equation.");
            sc.close();
            return;
        }
        double D = (b * b) - (4 * a * c);
        if (D > 0) {
            double root1 = (-b + Math.sqrt(D)) / (2 * a);
            double root2 = (-b - Math.sqrt(D)) / (2 * a);
            System.out.printf("Real and Distinct  roots : %.2f and %.2f",root1,root2);
        } 
        else if (D == 0) {
            double root = -b / (2 * a);
            System.out.printf("Real and Equal roots : %.2f",root);
        } 
        else {
            double real = -b / (2 * a);
            double imaginary = Math.sqrt(-D) / (2 * a);
            System.out.printf("Roots are complex and distinct.%n");
            System.out.printf("Root 1 = %.2f + %.2fi%n", real, imaginary);
            System.out.printf("Root 2 = %.2f - %.2fi%n", real, imaginary);
        }
        sc.close();
    }
}