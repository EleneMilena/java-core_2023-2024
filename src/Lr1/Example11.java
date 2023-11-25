package Lr1;

import java.util.Scanner;

public class Example11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String name = in.nextLine();
        System.out.println("Введите год рождения: ");
        int year = new Scanner(System.in).nextInt();
        System.out.println(name + " ваш возраст: " + getAge(year));
    }    private static int getAge(int year){
        return 2023 - year;}
}