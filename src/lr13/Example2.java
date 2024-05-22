package lr13;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Example2 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            try {
                // Определяем размер матрицы
                System.out.print("Введите количество строк матрицы: ");
                int rows = scanner.nextInt();
                System.out.print("Введите количество столбцов матрицы: ");
                int cols = scanner.nextInt();
                // Инициализируем матрицу
                int[][] matrix = new int[rows][cols];
                System.out.println("Введите элементы матрицы:");
                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < cols; j++) {
                        System.out.print("Элемент [" + i + "][" + j + "]: ");
                        matrix[i][j] = scanner.nextInt();
                    }
                }
                // Вводим номер столбца для вывода
                System.out.print("Введите номер столбца для вывода (начиная с 0): ");
                int colNumber = scanner.nextInt();
                // Проверяем допустимость номера столбца
                if (colNumber < 0 || colNumber >= cols) {
                    throw new ArrayIndexOutOfBoundsException("Нет столбца с таким номером");
                }
                // Выводим столбец
                System.out.println("Столбец " + colNumber + ":");
                for (int i = 0; i < rows; i++) {
                    System.out.println(matrix[i][colNumber]);
                }
            } catch (InputMismatchException e) {
                System.out.println("Ошибка: Введено неверное значение, ожидалось число.");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Ошибка: " + e.getMessage());
            } finally {
                scanner.close();
            }
        }
    }

