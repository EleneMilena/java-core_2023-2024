package Lr6;

public class Example3 {

        public static int findMax(int... numbers) {
            if (numbers.length == 0) {
                throw new IllegalArgumentException("No numbers provided");
            }

            int max = numbers[0];
            for (int num : numbers) {
                if (num > max) {
                    max = num;
                }
            }
            return max;
        }
        public static int findMin(int... numbers) {
            if (numbers.length == 0) {
                throw new IllegalArgumentException("No numbers provided");
            }

            int min = numbers[0];
            for (int num : numbers) {
                if (num < min) {
                    min = num;
                }
            }
            return min;
        }
        public static double findAverage(int... numbers) {
            if (numbers.length == 0) {
                throw new IllegalArgumentException("No numbers provided");
            }

            int sum = 0;
            for (int num : numbers) {
                sum += num;
            }
            return (double) sum / numbers.length;
        }
        public static void main(String[] args) {
            int[] values = {10, 5, 8, 20, 3};

            System.out.println("Max: " + findMax(values));
            System.out.println("Min: " + findMin(values));
            System.out.println("Average: " + findAverage(values));
        }
    }
