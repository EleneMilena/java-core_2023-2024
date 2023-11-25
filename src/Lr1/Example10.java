package Lr1;

import java.util.Scanner;

public class Example10 {
    public static void main(String[] args) {
    System.out.println("Введите год рождения: ");
    int year = new Scanner(System.in).nextInt();
    System.out.println("Ваш возраст: " + getAge(year));
    }    private static int getAge(int year){
        return 2023 - year;
    }
}