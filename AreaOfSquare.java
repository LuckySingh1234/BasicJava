import java.util.*;

class AreaOfSquare {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Side of Square");
        int side = sc.nextInt();
        int area = (side*side);
        System.out.println("Area of Suare = " + area);
    }
}