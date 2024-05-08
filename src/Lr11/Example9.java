package Lr11;

import java.util.ArrayList;
import java.util.List;
public class Example9 {
        public static List<String> filterStrings(List<String> inputList) {
            List<String> filteredList = new ArrayList<>();
            for (String str : inputList) {
                if (str.matches("[a-zA-Z]+")) {
                    filteredList.add(str);
                }
            }
            return filteredList;
        }
        public static void main(String[] args) {
            List<String> inputList = new ArrayList<>();
            inputList.add("apple123");
            inputList.add("banana");
            inputList.add("orange!");
            inputList.add("grape");
            inputList.add("pineapple");
            List<String> filteredList = filterStrings(inputList);
            System.out.println("Строки, содержащие только буквы:");
            for (String str : filteredList) {
                System.out.println(str);
            }
        }
    }

