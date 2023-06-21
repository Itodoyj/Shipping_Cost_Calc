// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;

public class Shipping_Cost_Calc {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the price of the Item"); //User enters the price of the item
        double itemPrice= scanner.nextDouble(); //System reads the price entered by the user which can be an integer or have decimal points
        double shippingCost; //Initialize the shipping cost

        //If block identifying the condition of the cost being less than or more than $100
        if (itemPrice>=100){
            shippingCost=0; //Free Shipping
        } else {
            shippingCost=itemPrice * 0.02;
        }

        double totalCost=itemPrice + shippingCost; //Finding the total cost of the Item
        System.out.println("Price of the Item: $"+itemPrice); //Print the price of the item
        System.out.println("Shipping Cost: $"+shippingCost); //Print the cost of Shipping
        System.out.println("Total Cost of the Item: $"+totalCost); //Print the total cost of the Item
        scanner.close();
    }
}
