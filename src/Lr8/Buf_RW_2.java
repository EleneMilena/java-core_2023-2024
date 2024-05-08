package Lr8;

import java.io.*;

public class Buf_RW_2 {
    public static void main(String[] args) {
        BufferedReader br = null;
        PrintWriter out = null; // Переменная out объявлена здесь
        try {
            // Создание потоков
            br = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream("E:\\MyFile1.txt"), "cp1251"));
            out = new PrintWriter("E:\\MyFile2.txt", "cp1251");
            // Инициализация переменной out здесь
            // Переписывание информации из одного файла в другой
            int lineCount = 0;
            String s;
            while ((s = br.readLine()) != null) {
                lineCount++;
                out.println(lineCount + ": " + s);
            }
        } catch (IOException e) {
            System.out.println("Ошибка !!!!!!!!");
        } finally {
            try {
                if (br != null) br.close();
                if (out != null) {
                    out.flush();
                    out.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
