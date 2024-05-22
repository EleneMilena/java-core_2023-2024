package timus2;

import java.util.Scanner;

public class task_1149 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1; i < n; i++) {
            System.out.print("(");
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (j > 1)
                    System.out.print((j & 1) == 1 ? "+" : "-");
                System.out.print("sin(" + j);
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(")");
            }
            System.out.print("+" + (n + 1 - i));
            if (i != n) {
                System.out.print(")");
            }
        }
    }
}