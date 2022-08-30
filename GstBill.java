import java.util.*;

class GstBill {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Price of three Products");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        float total = a+b+c;
        float gst = (total * 18) / 100;
        float bill = total + gst;
        System.out.println("Your Final Bill After Gst Is " + bill);
    }
}