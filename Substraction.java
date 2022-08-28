import java.util.*;

class Substraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int substract = a-b;
        System.out.println("Substraction of " + a + " and " + b + " is " + substract);
    }
}