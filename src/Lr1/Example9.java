package Lr1;

import java.util.Scanner;

public class Example9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите месяц");
        int month = in.nextInt();
        if (month == 1){
            System.out.println("31 день");
        } else if (month == 2){
            System.out.println("30 день");
        } else if (month == 3) {
            System.out.println("29 день");
        } else if (month == 4) {
            System.out.println("30 день");
        } else if (month == 5) {
            System.out.println("31 день");
        } else if (month == 6) {
            System.out.println("30 день");
        } else if (month == 7) {
            System.out.println("31 день");
        } else if (month == 8) {
            System.out.println("31 день");
        } else if (month == 9) {
            System.out.println("30 день");
        } else if (month == 10) {
            System.out.println("31 день");
        } else if (month == 11) {
            System.out.println("30 день");
        } else if (month == 12) {
            System.out.println("31 день");
        } else {
            System.out.println("Не верное значение месяца");
        }
        in.close();
    }
}