package Lr10;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class RevisionJsonParser1 {
    public static void main(String[] args) {
        try {
            JSONParser parser = new JSONParser();
            Object obj = parser.parse(new FileReader("src/Lr10/example-json.json"));
            JSONObject jsonObject = (JSONObject) obj;
            System.out.println("Корневой элемент: " + jsonObject.keySet().iterator().next());
            JSONArray jsonArray = (JSONArray) jsonObject.get("books");

            // Выводим книги из массива
            for (Object o : jsonArray) {
                JSONObject book = (JSONObject) o;
                System.out.println("\nТекущий элемент: book");
                System.out.println("Название книги: " + book.get("title"));
                System.out.println("Автор: " + book.get("author"));
                System.out.println("Год издания: " + book.get("year"));
            }

            // Запрашиваем название книги для удаления
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите название книги для удаления:");
            String bookTitleToDelete = scanner.nextLine().trim();

            // Проверяем каждую книгу на соответствие введенному названию
            for (int i = 0; i < jsonArray.size(); i++) {
                JSONObject book = (JSONObject) jsonArray.get(i);
                String title = (String) book.get("title");
                if (title.equalsIgnoreCase(bookTitleToDelete)) {
                    // Удаляем книгу из массива
                    jsonArray.remove(i);
                    System.out.println("Книга \"" + title + "\" успешно удалена.");
                    break; // Прерываем цикл, так как книга найдена и удалена
                }
            }

            // Сохраняем изменения в файле JSON
            try (FileWriter file = new FileWriter("src/Lr10/example-json.json")) {
                file.write(jsonObject.toJSONString());
                file.flush();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
