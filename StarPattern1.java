import java.util.*;

class StarPattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int n = sc.nextInt();
        int i,j, k;
        for(i = 1; i<=n; i++) {
            for(j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for(k = 1; k <= n; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
