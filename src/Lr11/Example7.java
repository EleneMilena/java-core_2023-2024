package Lr11;

import java.util.ArrayList;
import java.util.List;
public class Example7 {
        public static List<String> filterStrings(List<String> inputList, int minLength) {
            List<String> filteredList = new ArrayList<>();

            for (String str : inputList) {
                if (str.length() > minLength) {
                    filteredList.add(str);
                }
            }
            return filteredList;
        }
        public static void main(String[] args) {
            List<String> inputList = new ArrayList<>();
            inputList.add("apple");
            inputList.add("banana");
            inputList.add("orange");
            inputList.add("grape");
            inputList.add("pineapple");
            int minLength = 6;
            List<String> filteredList = filterStrings(inputList, minLength);
            System.out.println("Строки, длина которых больше " + minLength + ":");
            for (String str : filteredList) {
                System.out.println(str);
            }
        }
    }

