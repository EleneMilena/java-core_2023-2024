package Lr1;

import java.util.Scanner;

public class Example12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите возраст: ");
        int yearsold = new Scanner(System.in).nextInt();
        System.out.println("Год рождения: " + getAge(yearsold));
    }    private static int getAge(int yearsold){
        return 2023 - yearsold;}
}