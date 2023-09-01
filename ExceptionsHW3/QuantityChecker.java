package ExceptionsHW3;

import ExceptionsHW3.Exceptions.NotAvaliableInput;

public class QuantityChecker {
    private int number;

    public QuantityChecker(int number) {
        this.number = number;
    }

    public boolean productQuantityChecker() throws NotAvaliableInput {
        if (number > 0) {
            return true;
        }
        throw new NotAvaliableInput("Некорректное число");
    }

}
