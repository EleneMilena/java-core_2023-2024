package timus2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class task_1563 {

    public static void main(String[] args) {
        Set<String> strSet = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); // consume newline
        for (int i = 0; i < n; ++i) {
            String tempStr = scanner.nextLine();
            strSet.add(tempStr);
        }
        System.out.println("\n" + (n - strSet.size()));
    }
}