import java.util.*;

class PalindromeString {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String a = sc.nextLine();
        String rev = "";
        for(int i = a.length()-1; i >= 0; i--) {
            rev = rev + a.charAt(i);
        }
        if(a.equals(rev)) {
            System.out.println("It Is a Palindrome");
        }
        else {
            System.out.println("It is not a Palindrome");
        }
    }
}