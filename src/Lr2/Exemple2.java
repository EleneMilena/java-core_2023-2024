package Lr2;

import java.util.Scanner;

public class Exemple2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите любое целое число");
        int x = in.nextInt();
        int result = x % 5;
        System.out.println("result = " + result);
        if (result == 2){
            System.out.println("При делении на 5 в остатке получается 2");
        } else {
            System.out.println("При делении на 5 в остатке не получается 2");
        }
        int result1 = x % 7;
        System.out.println("result = " + result1);
        if (result1 == 1){
            System.out.println("При делении на 7 в остатке получается 1");
        } else {
            System.out.println("При делении на 7 в остатке не получается 1");
        }
        if (result == 2 && result1 == 1){
            System.out.println("Введенное число удовлетворяет критериям");
        } else {
            System.out.println("Введенное число не удовлетворяет критериям");
        }
    }
}
