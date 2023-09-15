/*
 * Задача №1
 * Реализуйте метод, который запрашивает у пользователя ввод
 * дробного числа (типа float), и возвращает введенное значение.
 * Ввод текста вместо числа не должно приводить к падению приложения,
 * вместо этого, необходимо повторно запросить у пользователя ввод данных.
 */
import java.util.Scanner;

public class Task_1 {

    public static void main(String[] args) {
        System.out.println(userInput());
    }

    // ****** Решение через while ******
    // Под дробным числом, понимаются числа формата *,*
    // public static float userInput() {
    //     float number = 0;
    //     Scanner scanner = new Scanner(System.in);
    //     System.out.print("Введите дробное число: ");
    //     while(scanner.hasNext()) {
    //         if (scanner.hasNextFloat() && !scanner.hasNextInt()) {
    //             number = scanner.nextFloat();
    //             break;
    //         } else {
    //             System.out.println("Вы ввели не дробное число!");
    //             System.out.print("Попробуйте еще раз: ");
    //             scanner.next();
    //         }
    //     }
    //     scanner.close();
    //     return number;
    // }
    
    // ****** Решение через try-catch ******
    public static float userInput() {
        float number = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите дробное число: ");
        while(true) {
            String str = scanner.nextLine();
            try {
                number = Float.parseFloat(str);
                if (number != (int) number) {
                    break;
                };
                System.out.println("Вы ввели не дробное число!");
                System.out.print("Попробуйте еще раз: ");
            } catch (NumberFormatException e) {
                System.out.println("Вы ввели не дробное число!");
                System.out.print("Попробуйте еще раз: ");
            }
        }
        scanner.close();
        return number;
    }
}