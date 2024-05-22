package timus2;

import java.util.*;

public class task_1585 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        if (n < 1 || n > 1000) {
            System.out.println("Количество записей должно быть в диапазоне от 1 до 1000.");
            return;
        }
        Map<String, Integer> penguinCounts = new HashMap<>();
        penguinCounts.put("Emperor Penguin", 0);
        penguinCounts.put("Little Penguin", 0);
        penguinCounts.put("Macaroni Penguin", 0);
        for (int i = 0; i < n; i++) {
            String penguinType = scanner.nextLine();
            penguinCounts.put(penguinType, penguinCounts.get(penguinType) + 1);
        }
        String mostPopularPenguin = "";
        int maxCount = 0;
        for (Map.Entry<String, Integer> entry : penguinCounts.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mostPopularPenguin = entry.getKey();
            }
        }
        System.out.println(mostPopularPenguin);
    }
}