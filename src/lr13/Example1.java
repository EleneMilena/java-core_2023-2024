package lr13;

import java.util.Scanner;
public class Example1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Введите размер массива: ");
            int size = scanner.nextInt();

            if (size <= 0) {
                throw new IllegalArgumentException("Размер массива должен быть положительным числом");
            }

            int[] array = new int[size];
            System.out.println("Введите элементы массива:");

            for (int i = 0; i < size; i++) {
                System.out.print("Элемент " + (i + 1) + ": ");
                array[i] = scanner.nextInt();
            }

            int sum = 0;
            int count = 0;

            for (int num : array) {
                if (num > 0) {
                    sum += num;
                    count++;
                }
            }

            if (count == 0) {
                throw new ArithmeticException("В массиве отсутствуют положительные числа");
            }

            double average = (double) sum / count;
            System.out.println("Среднее значение среди положительных элементов: " + average);

        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } catch (java.util.InputMismatchException e) {
            System.out.println("Ошибка: Введено неверное значение");
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

