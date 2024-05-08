package Lr8;
import java.io.*;
public class ConsonantWordsExtractor {
    public static void main(String[] args) {
        String sourceFilePath = "source1.txt";
        String destinationFilePath = "destination1.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(sourceFilePath));
             BufferedWriter writer = new BufferedWriter(new FileWriter(destinationFilePath))) {
            String line;
            int lineNumber = 0;
            while ((line = reader.readLine()) != null) {
                lineNumber++;
                String[] words = line.split("\\s+"); // Разбиваем строку на слова по пробелам
                int consonantWordsCount = 0;
                for (String word : words) {
                    if (startsWithConsonant(word)) {
                        writer.write(lineNumber + ": " + word + "\n");
                        consonantWordsCount++;
                    }
                }
                if (consonantWordsCount > 0) {
                    writer.write("Количество слов: " + consonantWordsCount + "\n\n");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static boolean startsWithConsonant(String word) {
        char firstChar = Character.toLowerCase(word.charAt(0));
        return firstChar != 'а' && firstChar != 'е' && firstChar != 'ё' &&
                firstChar != 'и' && firstChar != 'о' && firstChar != 'у' &&
                firstChar != 'ы' && firstChar != 'э' && firstChar != 'ю' &&
                firstChar != 'я';
    }
}
