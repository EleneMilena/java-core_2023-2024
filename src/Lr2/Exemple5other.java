package Lr2;

import java.util.Scanner;

public class Exemple5other {

    /*Нахождение четвертой цифры справа*/
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        int x = in.nextInt();
        String numberStr = Integer.toString(x);
        int fourthDigitFromRight = Character.getNumericValue(numberStr.charAt(numberStr.length() - 4));
        System.out.println("Во введенном числе = " + fourthDigitFromRight + " тысяч");
    }
    }
