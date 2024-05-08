package Lr9;
import java.util.LinkedList;
import java.util.List;
public class Example12 {
        public static void main(String[] args) {
            int N = 10; // Задайте необходимое количество человек

            // Моделирование процесса с использованием LinkedList
            int result = eliminateWithLinkedList(N);
            System.out.println("Остался человек с номером: " + result);
        }
        private static int eliminateWithLinkedList(int N) {
            List<Integer> people = new LinkedList<>();
            // Заполнение списка людьми
            for (int i = 1; i <= N; i++) {
                people.add(i);
            }
            int index = 0;
            while (people.size() > 1) {
                index = (index + 1) % people.size();
                people.remove(index);
            }
            return people.get(0);
        }
    }

