package Lr3;

import java.util.Scanner;

public class Exemple3 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.println("Ввведите количество чисел Фибоначчи");
        int x = id.nextInt();

        Fib.WhileFib(x);
        Fib.ForFib(x);
    }

    static class Fib {
        static void WhileFib(int x) {
            System.out.println("версия на основе оператора while");
            int i = x;
            long k = 0;
            long l = 1;
            long m = 1;
            while (i > 0) {
                System.out.printf("%d, ", m);
                m = k + l;
                k = l;
                l = m;
                i--;
            }
            System.out.println("конец цикла");
        }

        static void ForFib(int x) {
            System.out.println("версия на основе оператора for");
            long k = 0;
            long l = 1;
            long m = 1;
            for (int x1 = x; x1 > 0; --x1) {
                System.out.printf("%d, ", m);
                m = k + l;
                k = l;
                l = m;
            }
            System.out.println("конец цикла");
        }
    }
}
