package Lr11;

import java.util.ArrayList;
import java.util.List;
public class Example5 {

        public static List<String> filterStrings(List<String> inputList, String substring) {
            List<String> filteredList = new ArrayList<>();
            for (String str : inputList) {
                if (str.contains(substring)) {
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
            String substring = "apple";
            List<String> filteredList = filterStrings(inputList, substring);
            System.out.println("Строки, содержащие подстроку \"" + substring + "\":");
            for (String str : filteredList) {
                System.out.println(str);
            }
        }
    }

