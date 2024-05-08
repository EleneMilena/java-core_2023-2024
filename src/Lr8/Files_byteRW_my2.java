package Lr8;

import java.io.*;
import java.util.Scanner;
public class Files_byteRW_my2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите имя файла => ");
        String fname = sc.nextLine();
        try {
            // Создается файл
            File f1 = new File(fname);
            f1.createNewFile(); // файл создан
            System.out.println("Полный путь файла: " + f1.getAbsolutePath());
            System.out.print("Введите количество строк для записи в файл => ");
            int n = sc.nextInt();
            sc.nextLine(); // очистка буфера
            // Создается поток для записи с учетом типа данных – DataOutputStream,
            // и ему в качестве параметра передается поток FileOutputStream
            DataOutputStream dOut =
                    new DataOutputStream(new FileOutputStream(f1));
            for (int i = 0; i < n; i++) {
                System.out.print("Введите строку для записи в файл => ");
                String s = sc.nextLine();
                dOut.writeUTF(s);
                // или dOut.writeUTF(s +"\n" ); – запись отдельных строк
            }
            dOut.flush(); // дописываем несохраненные данные на диск
            dOut.close(); // закрываем поток
            // Чтение и вывод данных из созданного файла
            DataInputStream dIn = new DataInputStream(new FileInputStream(f1));
            while (true) {
                System.out.println(dIn.readUTF());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден.");
        } catch (IOException e) {
            System.out.println("Ошибка при чтении/записи файла: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Произошла ошибка: " + e.getMessage());
        }
    }
}
