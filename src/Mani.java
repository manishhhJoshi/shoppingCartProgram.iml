
import java.util.Scanner;
public class Mani {
    public static void main(String[] args){

        String item;
        int quantity;
        double price;
        char currency = '$';
        double total ;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the item you want to buy: ");
        item = scanner.nextLine();

        System.out.print("Enter the price of item : ");
        price = scanner.nextDouble();

        System.out.print("Enter the quantity in numbers : ");
        quantity = scanner.nextInt();

        total = quantity*price;
        System.out.print("Your total bill of "+quantity + " "+ item+"/s is :"+total + currency);



    }
}
