package Lr2;

import java.util.Scanner;

public class Exemple3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите любое целое число");
        int x = in.nextInt();
        int result = x % 4;
        System.out.println("result = " + result);
        if (result == 0){
            System.out.println("Введенное число делится на четыре");
        } else {
            System.out.println("Введенное число не делится на четыре");
        }
        if (x > 10){
            System.out.println("Введенное число больше 10");
        } else {
            System.out.println("Введенное число меньше 10");
        }
    }
}
