import java.util.*;

class StarPattern9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int num = sc.nextInt();
        for(int i =0; i<num; i++) {
            for(int j =0; j<num-i; j++) {
                System.out.print(" ");
            }
            int count = 1;
            for(int j =0; j<i; j++) {
                System.out.print(count);
                count++;
            }
            while(count>0) {
                System.out.print(count);
                count--;
            }
            System.out.println();
        }
    }
}