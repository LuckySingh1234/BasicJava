import java.util.*;

class FactorialByRecursion {

    static int fact(int num) {
        if(num == 0) {
            return 1;
        }
        return num*fact(num-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for the factorial");
        int num = sc.nextInt();
        int ans = fact(num);
        System.out.print(ans);
    }
}