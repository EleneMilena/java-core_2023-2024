package Lr8;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class Filc_BytcRcad_SamBuff {
    // Считывание no 5 символов (буфер)
    public static void readAllByArry(InputStream in) throws IOException {
        byte[] buff = new byte[5];
        while (true) {
            int count = in.read(buff);
            if (count != -1) {    // если не конец файла
                System.out.println("количество = " + count + ", buff =" +
                        Arrays.toString(buff) + ", str=" +
                        new String(buff, 0, count, "cp1251")); //"UTF8"
            } else {
                break;
            }
        }
    }
    public static void main(String[] args) throws IOException {
        String fileName = "src/Lr8/MyFile1.txt";
        InputStream inFile = null;
        try {
            inFile = new FileInputStream(fileName);
            readAllByArry(inFile);
        } catch (IOException e) {
            System.out.println("Ошибка открытия файла " + fileName + e);
        } finally {
            if (inFile != null) {
                try {
                    inFile.close();
                } catch (IOException ignore) {
                    /*NOP*/
                }
            }
        }
    }
}
