import java.util.*;

class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number upto where you want the Fibonacci");
        int num = sc.nextInt();   
        int a = 1; int b = 1;    
        System.out.print(a + " " + b + " ");
        for(int i = 1; i<=num; i++) {
            int c = a+b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
}