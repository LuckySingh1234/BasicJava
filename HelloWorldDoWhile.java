import java.util.*;

class HelloWorldDoWhile {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int count = 1;
        do {
            System.out.println("Hello World");
            count++;
        } while(count<=10);
    }
}