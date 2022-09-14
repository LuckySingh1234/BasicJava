import java.util.*;

class StarPattern8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int row = sc.nextInt();
        int count = 0;
        for(int i =0; i<row; i++) {
            for(int j =0; j<row-i-1; j++) {
                System.out.print(" ");
            }
            for(int k =0; k<2*i+1; k++) {
                System.out.print(count%10);
                count++;
            }
            System.out.println();
        }
    }
}