import java.util.*;

class AverageOfThreeNo {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Three Numbers");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
       float average = (a+b+c)/3;
        System.out.println("Average of Three numbers = " + average);
    }
}