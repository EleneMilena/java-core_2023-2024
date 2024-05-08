package Lr9;
import java.util.Scanner;
public class Example6 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Введите целое число: ");
            int decimalNumber = scanner.nextInt();

            String binary = convertToBinary(decimalNumber);

            System.out.println("Двоичное представление числа: " + binary);
        }
        private static String convertToBinary(int decimalNumber) {
            if (decimalNumber == 0) {
                return "0";
            } else {
                return convertToBinaryHelper(decimalNumber, "");
            }
        }
        private static String convertToBinaryHelper(int decimalNumber, String binarySoFar) {
            if (decimalNumber == 0) {
                return binarySoFar;
            } else {
                int remainder = decimalNumber % 2;
                binarySoFar = remainder + binarySoFar;
                return convertToBinaryHelper(decimalNumber / 2, binarySoFar);
            }
        }
}
