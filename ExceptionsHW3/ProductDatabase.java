package ExceptionsHW3;

import ExceptionsHW3.Exceptions.DatabaseException;

public class ProductDatabase {
    public static Product getProduct (int productId) throws DatabaseException {
        // Подразумевается обращение к базе данных или хранилищу товаров
        // и получение информации о товаре по его ID
        // В данном примере мы используем заглушку
        if (productId > 0) {
            return new Product("Product 1", 10, 5.99);
        }
        throw new DatabaseException("Product not found");
    }
}