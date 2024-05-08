package Lr8;

import java.io.*;

public class File_RW_byByte {
    public static void main(String[] args) throws IOException {
        Reader in = null;
        Writer out = null;
        try {
            in = new FileReader("С:\\MyFile 1 .txt");
            out = new FileWriter("С:\\MyFile2.txt", true);
            int oneByte;
            while ((oneByte = in.read()) != -1) {
                out.append((char)oneByte);
                System.out.print((char)oneByte);
            }
        } catch (IOException e) {
            System.out.println("Ошибка!!!!");
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }
}
