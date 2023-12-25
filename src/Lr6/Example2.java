package Lr6;

public class Example2 {
        private static int count = 0; // закрытое статическое целочисленное поле

        // статический метод для отображения текущего значения и увеличения на единицу
        public static void displayAndIncrement() {
            System.out.println("Текущее значение счетчика: " + count);
            count++;
        }
        public static void main(String[] args) {
            // Пример использования класса
            Example2.displayAndIncrement(); // Текущее значение счетчика: 0
            Example2.displayAndIncrement(); // Текущее значение счетчика: 1
            Example2.displayAndIncrement(); // Текущее значение счетчика: 2
        }
    }
