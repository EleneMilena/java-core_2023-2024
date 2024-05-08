package Lr8;

import java.io.*;
import java.util.Scanner;

public class FilesData {
    public static void main(String[] args) {
        try {
            // Создание исходного файла numIsh.txt и запись в него чисел типа float
            File fl = new File("C:\\My\\numIsh.txt");
            fl.createNewFile();
            Scanner sc = new Scanner(System.in, "cp1251");
            DataOutputStream wr =
                    new DataOutputStream(new FileOutputStream(fl.getAbsolutePath()));
            System.out.println("Cколько вещественных чисел записать в файл?");
            int count = sc.nextInt();
            System.out.println("Введите числа:");
            for (int i = 0; i < count; i++)
                wr.writeFloat(sc.nextFloat());
            wr.flush();
            wr.close();

            // Создание файла numRez.txt и переписывание в него чисел из numIsh.txt
            File f2 = new File("C:\\My\\numRez.txt");
            f2.createNewFile();

            // поток для чтения из исходного файла numIsh.txt
            DataInputStream rd =
                    new DataInputStream(new FileInputStream(fl.getAbsolutePath()));

            // поток для записи в результирующий файл numRez.txt
            wr = new DataOutputStream(new FileOutputStream(f2.getAbsolutePath()));

            try {
                while (true) {
                    float number = rd.readFloat();
                    wr.writeFloat(number);
                    System.out.println("Число " + number);
                }
            } catch (EOFException e) {
                System.out.println("End of file");
            } finally {
                rd.close();
                wr.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
