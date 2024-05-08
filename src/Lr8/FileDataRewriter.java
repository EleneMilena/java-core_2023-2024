import java.io.*;

public class FileDataRewriter {
    public static void main(String[] args) {
        // Указываем путь к исходному и результирующему файлам
        String sourceFilePath = "source.txt";
        String destinationFilePath = "destination.txt";

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(sourceFilePath), "UTF-8"));
             BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(destinationFilePath), "UTF-8"))) {

            // Считываем первую строку (в нашем случае это не нужно)
            String firstLine = reader.readLine();

            // Считываем вторую строку и записываем ее в результирующий файл
            String secondLine = reader.readLine();
            writer.write(secondLine);
            writer.newLine();

            // Читаем числа типа double, записываем только положительные числа
            for (int i = 0; i < 5; i++) {
                double number = Double.parseDouble(reader.readLine());
                if (number > 0) {
                    writer.write(Double.toString(number));
                    writer.newLine();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
