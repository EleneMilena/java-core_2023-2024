package Lr2;

import java.util.Scanner;

public class Exemple5 {

    /*Нахождение только количества тысяч*/
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        int x = in.nextInt();
        int result = x / 1000;
        System.out.println("Количество тысяч = " + result);


    }
}