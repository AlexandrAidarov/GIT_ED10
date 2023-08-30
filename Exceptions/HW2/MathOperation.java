package Exceptions.HW2;

import Exceptions.HW2.DivisionByZeroException;

public class MathOperation {
    private double numberOne;

    public void setNumberOne(double numberOne) {
        this.numberOne = numberOne;
    }

    public void setNumberTwo(double numberTwo) {
        this.numberTwo = numberTwo;
    }

    private double numberTwo;

    public double divide() throws DivisionByZeroException {
        if (numberTwo == 0) {
            throw new DivisionByZeroException("Деление на ноль недопустимо");
        }
        return numberOne / numberTwo;
    }
}