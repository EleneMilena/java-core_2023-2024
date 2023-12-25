package Lr6;

public class Example8 {

        // Статический метод для вычисления среднего значения в целочисленном массиве
        public static double calculateAverage(int[] array) {
            if (array == null || array.length == 0) {
                // Возвращаем 0 в случае пустого массива или null
                return 0;
            }
            // Вычисляем сумму значений в массиве
            int sum = 0;
            for (int num : array) {
                sum += num;
            }
            // Вычисляем среднее значение
            double average = (double) sum / array.length;
            return average;
        }
        public static void main(String[] args) {
            // Пример использования метода
            int[] myArray = {1, 2, 3, 4, 5};
            double result = calculateAverage(myArray);
            System.out.println("Среднее значение массива: " + result);
        }
}
