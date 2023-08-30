package Exceptions.HW2;

import Exceptions.HW2.InvalidNumberException;

public class NumberChecker {
    private int number;

    public NumberChecker(int number) {
        this.number = number;
    }

    public boolean checkNumber() throws InvalidNumberException {
        if (number > 0) {
            return true;
        }
        throw new InvalidNumberException("Некорректное число");
    }

}
