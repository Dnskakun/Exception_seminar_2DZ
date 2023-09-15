/*
 * Задача №2
 */

public class Task_2 {
    public static void main(String[] args) {
        
        int d = 0;
        int index = 8;
        int[] intArray = new int[10];
        
        if (d != 0 && intArray.length - 1 >= index) {
            double catchedRes1 = intArray[index] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } else {
            if (d == 0) {
                System.out.println("Делитель не может быть нулем!");
            }
            if (intArray.length - 1 < index) {
                System.out.println("Элемента массива под индексом " + index + " не существует.");
            }
        }
    }
}
