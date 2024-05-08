package Lr9;
import java.util.HashMap;
import java.util.Map;
public class Example10 {
        public static void main(String[] args) {
            // Создаем HashMap
            Map<Integer, String> hashMap = new HashMap<>();
           // Заполняем HashMap 10 объектами <Integer, String>
            hashMap.put(1, "One");
            hashMap.put(2, "Two");
            hashMap.put(3, "Three");
            hashMap.put(4, "Four");
            hashMap.put(5, "Five");
            hashMap.put(6, "Six");
            hashMap.put(7, "Seven");
            hashMap.put(8, "Eight");
            hashMap.put(9, "Nine");
            hashMap.put(10, "Ten");

            // Находим строки, у которых ключ > 5
            System.out.println("Строки с ключами больше 5:");
            for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
                if (entry.getKey() > 5) {
                    System.out.println(entry.getValue());
                }
            }

            // Выводим строки через запятую, если ключ = 0
            System.out.println("\nСтроки с ключом равным 0 через запятую:");
            if (hashMap.containsKey(0)) {
                System.out.println(String.join(", ", hashMap.get(0)));
            }
            // Перемножаем все ключи, где длина строки > 5
            int product = 1;
            for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
                if (entry.getValue().length() > 5) {
                    product *= entry.getKey();
                }
            }
            System.out.println("\nПроизведение ключей, где длина строки больше 5: " + product);
        }
}
