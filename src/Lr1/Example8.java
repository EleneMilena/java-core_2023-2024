package Lr1;

import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите день недели:");
        int day = in.nextInt();
        System.out.println("Введите месяца: ");
        int month = in.nextInt();
        System.out.println("Введите дату: ");
        int date = in.nextInt();
        System.out.println("Введите год: ");
        int year = in.nextInt();
        System.out.println("Сегодня " + day + " день недели " + date + ":"+ month + ":"+ year);
        in.close();
    }
}