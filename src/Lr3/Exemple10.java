package Lr3;

import java.util.Arrays;
import java.util.Random;

public class Exemple10 {
    public static void main(String[] args) {
        int arraySize = 10;
        int[] array = new int[arraySize];
        fillArray(array);
        System.out.println("Исходный массив: " + Arrays.toString(array));
        Arrays.sort(array);
        reverseArray(array);
        System.out.println("Отсортированный массив в порядке убывания: " + Arrays.toString(array));
    }
    private static void fillArray(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
    }

    // Метод для разворота массива
    private static void reverseArray(int[] array) {
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            // Меняем местами элементы на краях массива
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;

            // Переходим к следующей паре элементов
            left++;
            right--;
        }
    }
}