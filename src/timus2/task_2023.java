
import java.util.Scanner;

public class task_2023 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); // consume newline
        int s = 0;
        int pos = 1;
        for (int i = 0; i < n; ++i) {
            String b = scanner.nextLine();
            if (b.charAt(0) == 'A' || b.charAt(0) == 'P' || b.charAt(0) == 'O' || b.charAt(0) == 'R') {
                s += Math.abs(pos - 1);
                pos = 1;
            } else if (b.charAt(0) == 'B' || b.charAt(0) == 'M' || b.charAt(0) == 'O' || b.charAt(0) == 'S') {
                s += Math.abs(pos - 2);
                pos = 2;
            } else {
                s += Math.abs(pos - 3);
                pos = 3;
            }
        }
        System.out.println(s);
        scanner.close();
    }
}