import java.util.*;

class Division {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Numbers");
       int a = sc.nextInt();
       int b = sc.nextInt();
       float division = (float)a/b;
       System.out.println(" Division of " + a + " and " + b + " is " + division);
    }
}