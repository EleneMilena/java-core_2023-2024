package Lr1;

import java.util.Scanner;

public class Example9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите месяц");
        int month = in.nextInt();
        if (month == 1 || month == 3 ||month == 5 || month == 7 || month == 8 || month == 10  || month == 12){
            System.out.println("31 день");
        } else if (month == 2) {
            System.out.println("29 день");
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            System.out.println("30 день");
        } else {
            System.out.println("Не верное значение месяца");
        }
        in.close();
    }
}