import java.util.*;

class SumOfNaturalNumbers {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number Upto Where You Want to add the Sum");
        int n = sc.nextInt();
        int sum = 0;
        for(int i=1; i<=n; i++) {
            sum = sum + i;
        }
        System.out.println(" Sum of N Natural Numbers is " + sum );
    }
}