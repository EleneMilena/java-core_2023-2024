package Lr3;

import java.util.Arrays;
public class Exemple7 {
        public static void main(String[] args) {
            int Size = 10;
            char chars[] = new char[Size];
            char i = 's';
            for (int x = 0; x < Size; i--) {
                if (i % 2 == 1) {
                    chars[x] = i;
                    System.out.println("Элемент массива [" + x + "] = " + chars[x]);
                    x++;
                }
            }
            System.out.println("конец массива\n");
            Arrays.sort(chars);
            System.out.println("Произведена сортировка массива");
            for (int x = 0; x < chars.length; x++) {
                System.out.println("Элемент массива [" + x + "] после сортировки = " + chars[x]);
            }
            System.out.println("конец массива");
        }
}
