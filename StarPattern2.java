import java.util.*;

class StarPattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        System.out.println("Enter the number of columns");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int i,j;
        for(i = 1; i<=n; i++) {
            for(j = 1; j<=m; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}