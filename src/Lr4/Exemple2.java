package Lr4;

public class Exemple2 {
    public static void main(String[] args) {
        int height = 15;
        int z = 0;
        for (int i = 1; i <= height; i++) {
            System.out.print("номер строки: " + i + " ");
            for (int j = 0; j <= z; j++) {
                System.out.print("+");
            }
            z = z + 1;
            System.out.println(" Количество символов в строке " + z);
        }
    }
}
