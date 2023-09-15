/* 
 * Задача №4
 * Разработайте программу, которая выбросит Exception,
 * когда пользователь вводит пустую строку. Пользователю
 * должно показаться сообщение, что пустые строки вводить нельзя.
 */
import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        String str = "";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите произвольную строку:");

        while (true) {
            str = scanner.nextLine();
            if (!str.isEmpty()) {
                System.out.println(str);
                break;
            } else {
                System.out.print("Введена пустая строка! Попробуйте еще: ");
            }
        }
        scanner.close();
    }
}
