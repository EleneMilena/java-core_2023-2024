package Lr4;

public class Exemple1 {
    public static void main(String[] args) {
        int figure = 10;
        int i;
        int j;
        int z;

        for (i = 1 ; i <= figure; i++) {
            System.out.print("номер строки: " + i + " ");
            z = 0;
            for (j = -5; j < figure; j++){
                System.out.print("+");
                z = z + 1;
            }
            System.out.print("Количество символов в строке " + z);
        }
    }
}
