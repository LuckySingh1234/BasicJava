import java.util.*;

class SumOfEvenAndOdd {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers You want to enter");
        int n = sc.nextInt();
        System.out.println("Enter Numbers one by one");
        int sumOdd = 0, sumEven = 0;
        for(int i = 0; i<n; i++) {
            int temp = sc.nextInt();
            if(temp % 2 == 0) {
                sumEven = sumEven + temp;
            }
            else {
                sumOdd = sumOdd + temp;
            }
        }
        System.out.println("Sum Of Even Numbers = " + sumEven);
        System.out.println("Sum Of Odd Numbers = " + sumOdd);
    }
}