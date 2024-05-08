package Lr9;
import java.util.ArrayList;
import java.util.List;
public class Example11 {
        public static void main(String[] args) {
            int N = 10; // Задайте необходимое количество человек

            // Моделирование процесса с использованием ArrayList
            int result = eliminateWithArrayList(N);
            System.out.println("Остался человек с номером: " + result);
        }

        private static int eliminateWithArrayList(int N) {
            List<Integer> people = new ArrayList<>();

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
