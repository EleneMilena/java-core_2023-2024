package Lr11;

import java.util.ArrayList;
import java.util.List;
public class Example6 {
        public static List<Integer> filterNumbers(List<Integer> inputList, int divisor) {
            List<Integer> filteredList = new ArrayList<>();
            for (int num : inputList) {
                if (num % divisor == 0) {
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
            int divisor = 5;
            List<Integer> filteredList = filterNumbers(inputList, divisor);
            System.out.println("Числа, делящиеся на " + divisor + " без остатка:");
            for (int num : filteredList) {
                System.out.println(num);
            }
        }
    }

