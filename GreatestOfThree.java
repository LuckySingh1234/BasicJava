import java.util.*;

class GreatestOfThree {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Three Numbers");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        if(a>b && a>c) {
            System.out.println("a is greatest");
        }
        else if(b>a && b>c) {
            System.out.println("b is greatest");
        }
        else {
            System.out.println("c is greatest");
        }
    }
}