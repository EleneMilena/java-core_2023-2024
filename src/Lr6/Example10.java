package Lr6;

public class Example10 {

        public static int[] findMinMax(int... numbers) {
            if (numbers.length == 0) {
                throw new IllegalArgumentException("Необходимо передать хотя бы одно значение");
            }

            int min = numbers[0];
            int max = numbers[0];

            for (int num : numbers) {
                if (num < min) {
                    min = num;
                } else if (num > max) {
                    max = num;
                }
            }

            return new int[]{min, max};
        }

        public static void main(String[] args) {
            // Пример использования
            int[] values = findMinMax(3, 1, 7, 4, 2, 9, 5);
            System.out.println("Минимальное значение: " + values[0]);
            System.out.println("Максимальное значение: " + values[1]);
        }
    }

