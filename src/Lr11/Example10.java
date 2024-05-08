package Lr11;
import java.util.ArrayList;
import java.util.List;
public class Example10 {
        public static List<Integer> filterNumbers(List<Integer> inputList, int threshold) {
            List<Integer> filteredList = new ArrayList<>();
            for (int num : inputList) {
                if (num < threshold) {
                    filteredList.add(num);
                }
            }
            return filteredList;
        }
        public static void main(String[] args) {
            List<Integer> inputList = new ArrayList<>();
            inputList.add(10);
            inputList.add(15);
            inputList.add(20);
            inputList.add(25);
            inputList.add(30);

            int threshold = 20;

            List<Integer> filteredList = filterNumbers(inputList, threshold);

            System.out.println("Числа, которые меньше " + threshold + ":");
            for (int num : filteredList) {
                System.out.println(num);
            }
        }
    }

