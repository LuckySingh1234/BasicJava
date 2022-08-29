import java.util.*;

class Remainder {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two Numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int remainder = a%b;
        System.out.println(" Remainder of " + a + " and " + b + " is " + remainder);
    }
}