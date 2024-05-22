package timus2;

import java.util.Scanner;
import java.util.Vector;

public class task_1263 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        Vector<Integer> a = new Vector<>(n);
        for (int i = 0; i < n; ++i) {
            a.add(0);
        }
        for (int i = 0; i < m; ++i) {
            int t = scanner.nextInt();
            a.set(t - 1, a.get(t - 1) + 1);
        }
        for (int i = 0; i < a.size(); ++i) {
            System.out.printf("%.2f%%\n", a.get(i) * 100.0 / m);
        }
    }
}
