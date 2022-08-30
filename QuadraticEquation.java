import java.util.*;

class QuadraticEquation {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Quadratic Equation");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("Your Entered Equation = " + a + "x^2 + " + b + "x + " + c);
        double D = b*b - 4*a*c;
        D = Math.sqrt(D);
        double firstRoot = (-b + D)/(2*a);
        double secondRoot = (+b + D)/(2*a);
        System.out.println("Roots are " + firstRoot + " and " + secondRoot);
        

    }
}