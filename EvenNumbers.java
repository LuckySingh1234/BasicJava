import java.util.*;

class EvenNumbers {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Number");
        int a = sc.nextInt();
        System.out.println("These all Even Numbers lies between 1 and " + a);
        for(int i=2; i<=a; i=i+2) {
            System.out.print(i + " ");
        }
    }
}