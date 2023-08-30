package Exceptions.HW2;
   /*
    Задача 1:
    Напишите программу, которая запрашивает у пользователя число и проверяет,
    является ли оно положительным. Если число отрицательное или равно нулю,
    программа должна выбрасывать исключение InvalidNumberException с сообщением "Некорректное число".
    В противном случае, программа должна выводить сообщение "Число корректно".
    */
import Exceptions.HW2.InvalidNumberException;
import Exceptions.HW2.ConsoleView;

public class HW2Task1 {
   
    public static void main(String[] args) throws InvalidNumberException {
        ConsoleView view = new ConsoleView();
        view.run();
    }
}
