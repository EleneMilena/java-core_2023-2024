package timus2;

import java.util.Scanner;

public class task_2523 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; ++i) {
            int m = scanner.nextInt();
            if (Math.sqrt(8.0 * m - 7) == (int) Math.sqrt(8.0 * m - 7)) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }
}