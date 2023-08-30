package Exceptions.HW2;
/*
Задача 2:
Напишите программу, которая запрашивает у пользователя два числа и выполняет их деление.
Если второе число равно нулю, программа должна выбрасывать исключение 
DivisionByZeroException с сообщением "Деление на ноль недопустимо".
В противном случае, программа должна выводить результат деления.
*/
import Exceptions.HW2.DivisionByZeroException;
import Exceptions.HW2.ConsoleView2;


public class HW2Task2 {
    public static void main(String[] args) throws DivisionByZeroException {
        ConsoleView2 view = new ConsoleView2();
        view.run();
    }

}
