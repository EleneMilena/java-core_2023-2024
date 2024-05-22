package lr13;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Example3 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            try {
                System.out.print("Введите размер массива: ");
                int size = scanner.nextInt();
                if (size <= 0) {
                    throw new IllegalArgumentException("Размер массива должен быть положительным числом");
                }
                byte[] array = new byte[size];
                System.out.println("Введите элементы массива (типа byte):");
                for (int i = 0; i < size; i++) {
                    System.out.print("Элемент " + (i + 1) + ": ");
                    int value = scanner.nextInt();

                    // Проверка, что значение находится в пределах типа byte
                    if (value < Byte.MIN_VALUE || value > Byte.MAX_VALUE) {
                        throw new ArithmeticException("Значение " + value + " выходит за границы диапазона типа byte");
                    }
                    array[i] = (byte) value;
                }
                int sum = 0;
                for (byte num : array) {
                    sum += num;
                }
                System.out.println("Сумма элементов массива: " + sum);
            } catch (InputMismatchException e) {
                System.out.println("Ошибка: Введено неверное значение, ожидалось число.");
            } catch (ArithmeticException e) {
                System.out.println("Ошибка: " + e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println("Ошибка: " + e.getMessage());
            } finally {
                scanner.close();
            }
        }
    }

