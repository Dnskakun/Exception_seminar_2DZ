/*
 * Задача №3
 */

public class Task_3 {
    public static void main(String[] args) {
        int a = 90;
        int b = 3;
        System.out.println(a / b);
        printSum(23, 234);
        int[] abc = { 1, 2 };
        if (3 <= abc.length - 1) {
            abc[3] = 9;
        } else {
            System.out.println("Массив выходит за пределы своего размера!");
        }
    }

    public static void printSum(Integer a, Integer b) {
       System.out.println(a + b);
    }
     
}
