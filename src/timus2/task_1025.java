package timus2;

import java.util.*;

public class task_1025 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        int k = 0;
        for (int i = 0; i < n; ++i) {
            int bb = scanner.nextInt();
            a.add(bb);
        }
        Collections.sort(a);
        for (int i = 0; i <= a.size() / 2; ++i)
            k += (a.get(i) / 2) + 1;
        System.out.println(k);
    }
}
