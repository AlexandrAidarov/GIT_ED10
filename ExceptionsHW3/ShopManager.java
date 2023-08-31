package ExceptionsHW3;

import ExceptionsHW3.Exceptions.DatabaseException;

public class ShopManager {
    public static double purchaseProduct(int productId, int quantity) throws DatabaseException {
        try {
            Product product = ProductDatabase.getProduct(productId);
            double totalPrice = product.getPrice() * quantity;
            return totalPrice;
        } catch (DatabaseException e) {
            throw new DatabaseException(e.getMessage());
        } 
        

    }
}
