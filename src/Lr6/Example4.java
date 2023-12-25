package Lr6;

public class Example4 {
        public static void main(String[] args) {
            // Пример использования метода для вычисления двойного факториала числа 6
            int number = 6;
            long result = calculateDoubleFactorial(number);
            System.out.println(number + "!! = " + result);
        }
        // Статический метод для вычисления двойного факториала числа
        public static long calculateDoubleFactorial(int n) {
            // Проверка на неотрицательность числа
            if (n < 0) {
                throw new IllegalArgumentException("Число должно быть неотрицательным");
            }
            // Инициализация результата
            long result = 1;

            // Вычисление двойного факториала
            for (int i = n; i >= 1; i -= 2) {
                result *= i;
            }

            return result;
        }
    }
