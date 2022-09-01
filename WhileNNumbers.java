import java.util.*;

class WhileNNumbers {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range");
        int range = sc.nextInt();
        int count = 1;
        while(count <= range) {
            System.out.print(count + " ");
            count++;
        }
        System.out.println();

    }
}