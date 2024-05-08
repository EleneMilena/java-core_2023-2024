package Lr8;

import java.io.*;

public class Buf_RW_3 {
    public static void main(String[] args) {
        BufferedReader br = null;
        BufferedWriter out = null;
        try {
            br = new BufferedReader(new FileReader("С:\\MyFile1.txt"), 1024);
            out = new BufferedWriter(new FileWriter("С:\\MyFile2.txt"));
            int lineCount = 0;    // счетчик строк
            String s;
            while ((s = br.readLine()) != null) {
                lineCount++;
                System.out.println(lineCount + ":" + s);
                out.write(s);
                out.newLine();    // переход на новую строку
            }
        } catch (IOException e) {
            System.out.println("Ошибка !!!!!!!!");
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
                if (out != null) {
                    out.flush();
                    out.close();
                }
            } catch (IOException e) {
                System.out.println("Ошибка при закрытии потоков");
            }
        }
    }
}
