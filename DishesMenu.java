import java.util.*;

class DishesMenu {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number from 1 to 7 for menue");
        int number = sc.nextInt();
        switch (number) {
            case 1 : System.out.println("Pizza");
                break;
            case 2 : System.out.println("Dosa");
                break;
            case 3 : System.out.println("Rice");
                break;
            case 4 : System.out.println("Sandwitch");
                break;
            case 5 : System.out.println("Gulab Jamun");
                break;
            case 6 : System.out.println("Cold Drink");
                break;
            case 7 : System.out.println("Samosha");
                break;
            default :System.out.println("It Is not Available");


        }
    }
}