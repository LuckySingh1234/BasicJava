import java.util.*;

class SumOfNaturalNumbersByRecursion {
    
    static int sum(int n) {
            if(n == 1) {
            return 1;
        }
        return n+sum(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number upto where you want the sum");
        int n = sc.nextInt();
        int ans = sum(n);
        System.out.print(ans);
    }
}