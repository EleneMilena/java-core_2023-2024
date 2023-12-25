package Lr6;

public class Example5 {
        public static void main(String[] args) {
            // Передаем число n в метод и выводим результат
            int n = 5; // Замените значение на нужное
            System.out.println("Сумма квадратов натуральных чисел от 1 до " + n + " равна: " + calculateSumOfSquares(n));
        }
        // Статический метод для вычисления суммы квадратов натуральных чисел
        static int calculateSumOfSquares(int n) {
            // Используем формулу суммы квадратов натуральных чисел
            return (n * (n + 1) * (2 * n + 1)) / 6;
        }
    }

