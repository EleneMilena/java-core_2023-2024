package Lr6;

    import java.util.Arrays;
public class Example6 {
        public static void main(String[] args) {
            // Пример использования
            int[] originalArray = {1, 2, 3, 4, 5};
            int numberOfElements = 3;
            int[] resultArray = extractSubarray(originalArray, numberOfElements);
            // Выводим результат
            System.out.println("Исходный массив: " + Arrays.toString(originalArray));
            System.out.println("Новый массив: " + Arrays.toString(resultArray));
        }
        // Статический метод для извлечения подмассива из исходного массива
        static int[] extractSubarray(int[] originalArray, int numberOfElements) {
            // Проверяем, не больше ли количество элементов, чем длина исходного массива
            int length = Math.min(numberOfElements, originalArray.length);

            // Создаем новый массив нужной длины
            int[] resultArray = Arrays.copyOf(originalArray, length);
            return resultArray;
        }
    }

