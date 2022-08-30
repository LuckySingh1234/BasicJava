import java.util.*;

class AverageOfNNumbers {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        float sum = 0;
        for(int i = 0; i<n; i++) {
            float temp = sc.nextFloat();
            sum = sum + temp;
        }
        float average = sum/n;
        System.out.println("Average of your numbers is " + average);
    }
}