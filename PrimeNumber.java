import java.util.*;

class PrimeNumber {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Number to check it is prime or not");
        int a = sc.nextInt();
        int div;
        for(div = 2; div<a; div++) {
            if(a%div==0) {
                break;
            }
        }
        if(div==a) {
            System.out.println("It is a Prime Number");
        }
        else {
            System.out.println("It is not a Prime Number");
        }
        
    }
}