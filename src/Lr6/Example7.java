package Lr6;

public class Example7 {
        public static void main(String[] args) {
            char[] charArray = {'a', 'b', 'c', 'd', 'e'};
            // Вызываем статический метод и передаем ему символьный массив
            int[] intArray = convertCharArrayToIntArray(charArray);
            // Выводим результат
            System.out.println("Символьный массив: " + new String(charArray));
            System.out.println("Целочисленный массив: " + java.util.Arrays.toString(intArray));
        }
        // Статический метод для конвертации символьного массива в целочисленный массив
        public static int[] convertCharArrayToIntArray(char[] charArray) {
            int[] intArray = new int[charArray.length];
            for (int i = 0; i < charArray.length; i++) {
                intArray[i] = (int) charArray[i]; // Преобразование символа в его код
            }
            return intArray;
        }
    }
