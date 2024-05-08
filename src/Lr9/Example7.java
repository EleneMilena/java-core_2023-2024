package Lr9;
import java.util.Scanner;
public class Example7 {
         public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите размер массива: ");
            int size = scanner.nextInt();
            int[] array = new int[size];
            // Ввод массива
            inputArray(array, 0);
            // Вывод массива
            System.out.println("Введенный массив:");
            outputArray(array, 0);
        }
        private static void inputArray(int[] array, int index) {
            if (index < array.length) {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Введите элемент массива[" + index + "]: ");
                array[index] = scanner.nextInt();
                inputArray(array, index + 1);
            }
        }
        private static void outputArray(int[] array, int index) {
            if (index < array.length) {
                System.out.println("Элемент массива[" + index + "]: " + array[index]);
                outputArray(array, index + 1);
            }
        }
    }
