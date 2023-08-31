package ExceptionsHW3;

import java.util.Scanner;

import ExceptionsHW3.Exceptions.DatabaseException;
import ExceptionsHW3.Exceptions.NotAvaliableInput;

public class OnlineShopUI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter product ID: ");
        int productId = scanner.nextInt();
        while (productId < 1) {
            System.out.print("WRONG ID!Enter product ID: ");
            productId = scanner.nextInt();
        }
        
        //int quantity = new Intejer;
        //getProductQuantity();


        try{
            double totalPrice = ShopManager.purchaseProduct(productId, quantity);
            System.out.println("Total price: $" + totalPrice);
        }catch (DatabaseException e){
            System.out.println(e.getMessage());
        }

        public static void getProductQuantity() throws NotAvaliableInput {

            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter quantity: ");
            int quantity = scanner.nextInt();

            if (quantity > 0) {
                return quantity;
            }
            throw new NotAvaliableInput("Product not found");
        }        





    }
}
