package timus2;

import java.util.Scanner;

public class task_1409 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int d = a;
        a = b - 1;
        b = d - 1;
        System.out.println(a + " " + b);
    }
}