package Lr8;
import java.io.*;
public class Buf_WR_IO_4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        BufferedWriter bw = null;
        try {
            // Создание потоков для чтения и записи с нужной кодировкой
            br = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream("С:\\MyFile1.txt"), "cp1251"));
            bw = new BufferedWriter(
                    new OutputStreamWriter(
                            new FileOutputStream("С:\\MyFile2.txt"), "cp1251"));
            // Переписывание информации из одного файла в другой
            int lineCount = 0; // счетчик строк
            String s;
            while ((s = br.readLine()) != null) {
                lineCount++;
                System.out.println(lineCount + ": " + s);
                bw.write(lineCount + ": " + s); // запись без перевода строки
                bw.newLine(); // принудительный переход на новую строку
            }
        } catch (IOException e) {
            System.out.println("Ошибка!!!!!!!!");
        } finally {
            if (br != null) {
                br.close();
            }
            if (bw != null) {
                bw.flush();
                bw.close();
            }
        }
    }
}
