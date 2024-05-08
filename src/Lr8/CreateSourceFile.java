package Lr8;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CreateSourceFile {
    public static void main(String[] args) {
        String filename = "source.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            // Записываем первую строку
            writer.write("Первая строка\n");

            // Записываем вторую строку
            writer.write("Вторая строка\n");

            // Записываем числа типа double
            writer.write("1.5\n");
            writer.write("-2.0\n");
            writer.write("3.7\n");
            writer.write("-4.2\n");
            writer.write("5.0\n");

            System.out.println("Файл успешно создан: " + filename);
        } catch (IOException e) {
            System.out.println("Ошибка при создании файла: " + e.getMessage());
        }
    }
}
