package Lr8;

import java.io.*;

public class CreateSourceFile1 {
    public static void main(String[] args) {
        String fileName = "source1.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            // Записываем несколько строк текста на русском языке
            writer.write("Тихо в роще шумит ветер,");
            writer.newLine();
            writer.write("Здесь вечер дремлет под деревом.");
            writer.newLine();
            writer.write("Буря веет, гром гремит,");
            writer.newLine();
            writer.write("И шагает дождик маленький,");
            writer.newLine();
            writer.write("Дождик маленький, ветерок скулит,");
            writer.newLine();
            writer.write("Грянула молния в тишине.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
