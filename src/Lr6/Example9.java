package Lr6;

public class Example9 {
        public static void main(String[] args) {
            char[] charArray = {'a', 'b', 'c', 'd', 'e'};

            System.out.println("Исходный массив:");
            printArray(charArray);

            swapPairs(charArray);

            System.out.println("\nМассив после обмена парами:");
            printArray(charArray);
        }
        public static void swapPairs(char[] arr) {
            int length = arr.length;
            for (int i = 0; i < length / 2; i++) {
                char temp = arr[i];
                arr[i] = arr[length - 1 - i];
                arr[length - 1 - i] = temp;
            }
        }
        public static void printArray(char[] arr) {
            for (char element : arr) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

