import java.util.*;

class PalindromeNumber {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int a = sc.nextInt();
        int rev = 0;
        int temp = a;
        while(a > 0) {
            rev = rev*10 + (a % 10);
            a = a /10;
        }
        if (rev == temp) {
            System.out.println("It Is a Palindrome Number");
        }
        else {
            System.out.println("It Is Not a Palindrome Number");
        }
    }
}